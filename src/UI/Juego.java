/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.*;
import Bussiness.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Juego implements Runnable {

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public BufferStrategy getBs() {
        return bs;
    }

    public void setBs(BufferStrategy bs) {
        this.bs = bs;
    }

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }

    public Estado getGameState() {
        return gameState;
    }

    public void setGameState(Estado gameState) {
        this.gameState = gameState;
    }

    public Estado getMenuState() {
        return menuState;
    }

    public void setMenuState(Estado menuState) {
        this.menuState = menuState;
    }

    public Entrada getKeyManager() {
        return keyManager;
    }

    public void setKeyManager(Entrada keyManager) {
        this.keyManager = keyManager;
    }
    
    private Display display;
    private int ancho, altura;
    public String title;
    private CamaraJuego camaraJuego;
    private boolean running = false;
    private Thread thread;
    private Mundo mundo;

    
    
    private BufferStrategy bs;
    private Graphics g;
    
    private Estado gameState;
    private Estado menuState;
    
    private Entrada keyManager;
    
    public Juego(String title, int ancho, int altura){
        this.ancho = ancho;
        this.altura = altura;  
        this.title = title;
        keyManager = new Entrada();
    }
    
    private void init(){
        display = new Display(title, ancho, altura);
        Display.getFrame().addKeyListener(keyManager);
        Imagenes.init();
        camaraJuego = new CamaraJuego(this,0,0);
        gameState = new EstadoJuego(this);
        menuState = new EstadoMenu(this);
        Estado.setState(gameState);
    }
    
    
    private void tick(){
        keyManager.tick();
        
        if (Estado.getState() != null){
            Estado.getState().tick();
        }
    }
    
    private void render (){
        bs = Display.getCanvas().getBufferStrategy();
        if(bs == null){
            Display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //Clear Screen
        g.clearRect(0, 0, ancho, altura);
        //Draw
        
                
        if (Estado.getState() != null){
            Estado.getState().render(g);
        }
        
        //End Draw
        bs.show();
        g.dispose();
        
    }
    
    @Override
    public void run(){
        
        init();
        
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta=0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;
        
        while(running){
            now = System.nanoTime();
            delta +=(now - lastTime)/timePerTick;
            timer += now-lastTime;
            lastTime = now;
            
            if(delta >=1){
                tick();
                render();
                ticks++;
                delta--;
            }
            
            if(timer >= 1000000000){
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
        
        stop();
        
    }
    
    public Entrada getEntrada(){
        return keyManager;
    }
    
    public CamaraJuego getCamaraJuego(){
        return camaraJuego;
    }
    
    public int getAncho() {
        return ancho;
    }

    public int getAltura() {
        return altura;
    }
    public Mundo getMundo(){
        return mundo;
    }
    
    public synchronized void start(){
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
