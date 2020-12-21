/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import UI.Juego;
import java.awt.Graphics;

/**
 *
 * @author Julian
 */
public class Mundo {
    
    private Juego juego;
    private int ancho, altura;
    private int [][]baldosa;
    private int ApareceX,ApareceY;
    
    public Mundo(Juego juego, String path){
        this.juego=juego;
        cargarMundo(path);
        
    }
    public void tick(){
        
    }
    
    public void render(Graphics g){
          for(int y=0;y<altura;y++){
            for(int x=0;x<ancho;x++){
               getBaldosa(x,y).render(g, (int) (x*Baldosa.ANCHO_BALDOSA-juego.getCamaraJuego().getAjusteX()),
                       (int) (y*Baldosa.ALTURA_BALDOSA-juego.getCamaraJuego().getAjusteY()));
            }
            
        }
    }
    
    public Baldosa getBaldosa(int x, int y){
        Baldosa B = Baldosa.baldosa[baldosa[x][y]];
        if(B==null){
           return Baldosa.pisoBaldosa; 
        }
            
           return B;
    }
    public Baldosa obtenerBaldosa(int x, int y){
        if(x<0||y<0||x>=ancho||y>=altura)return Baldosa.rocaBaldosa;
        if (Baldosa.baldosa[baldosa[x][y]]==Baldosa.rocaBaldosa)return Baldosa.rocaBaldosa;
        if (Baldosa.baldosa[baldosa[x][y]]==Baldosa.pisoBaldosa)return Baldosa.pisoBaldosa;
        
        return Baldosa.pisoBaldosa;
    }
    
   
    
    private void cargarMundo(String path){
   
       String archivo = Utilidad.cargarArchivoComoString(path);
       String[] tokens = archivo.split("\\s+");
       ancho=Utilidad.parseInt(tokens[0]);
       altura=Utilidad.parseInt(tokens[1]);
       ApareceX=Utilidad.parseInt(tokens[2]);
       ApareceY=Utilidad.parseInt(tokens[3]);
        
       baldosa =new int[ancho][altura];
       for(int y=0;y<altura;y++){
            for(int x=0;x<ancho;x++){
               baldosa[x][y]=Utilidad.parseInt(tokens[(x+y*ancho)+4]);
            }
            
        }
    }
    
}
