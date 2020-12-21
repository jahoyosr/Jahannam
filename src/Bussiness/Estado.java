/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import UI.Juego;
import java.awt.Graphics;


public abstract class Estado {

    public static Estado getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(Estado currentState) {
        Estado.currentState = currentState;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    private static Estado currentState = null;
    
    public static void setState(Estado state){
        currentState = state;
    }
    
    public static Estado getState (){
        return currentState;
    }
    
    protected Juego juego;
    public Estado (Juego juego){
        this.juego = juego;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
}