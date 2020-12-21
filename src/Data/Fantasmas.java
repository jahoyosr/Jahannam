/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Bussiness.Estado;
import UI.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Julian
 */
public class Fantasmas extends Criaturas{
    //yr and xr positions for rectangle
MensajePerder mensajeperder= new MensajePerder();  
private BufferedImage imagenfantasma;
boolean muerto=false;
    public Fantasmas(Juego juego, float x, float y) {
        super(juego, x, y, 28, 28);
        this.x=x;
        this.y=y;
    }

float v=3;

public void movimientoHorizontalFantasma(int Xa) {
 

     if(x<2+Xa){
        v=3; 
        imagenfantasma=Imagenes.ghost_right;
     }
     if(x>560+Xa){
        v=-3;
        imagenfantasma=Imagenes.ghost_left;
      }     
      x+=v; 
   
}
public void movimientoVerticalFantasma(int Ya) {
     
     if(y<2+Ya){
      v=3; 
      imagenfantasma=Imagenes.ghost_right;
     }
     if(y>560+Ya){
      v=-3;
      imagenfantasma=Imagenes.ghost_left;
     }     
      y+=v; 

}
public void movimientoDiagonalFantasma(int Xa, int Ya) {
        
     if(y<2+Ya&&x<2+Xa){
      v=3;
     
      imagenfantasma=Imagenes.ghost_right;
     }
     if(y>560+Ya&&x>560+Xa){
      v=-3;
     
      imagenfantasma=Imagenes.ghost_left;
     } 
      x+=v;
      y+=v; 

}
  
    @Override
    public void tick() {
       
       
    }
    
    public boolean eliminado(Jugador jugador, Fantasmas fantasma, Fantasmas fantasma1, Fantasmas fantasma2, Fantasmas fantasma3
    , Fantasmas fantasma4, Fantasmas fantasma5, Fantasmas fantasma6, Fantasmas fantasma7, Fantasmas fantasma8, Fantasmas fantasma9
    , Fantasmas fantasma10, Fantasmas fantasma11, Fantasmas fantasma12, Fantasmas fantasma13, Fantasmas fantasma14, Fantasmas fantasma15
    , Fantasmas fantasma16, Fantasmas fantasma17, Fantasmas fantasma18, Fantasmas fantasma19){
        
        if((x>(jugador.x-20))&&(x<(jugador.x+20))&&(y>(jugador.y-20))&&(y<(jugador.y+20))){
            muerto=true;
            jugador.velocidad=0;
            fantasma.v=0;
            fantasma1.v=0;
            fantasma2.v=0;
            fantasma3.v=0;
            fantasma4.v=0;
            fantasma5.v=0;
            fantasma6.v=0;
            fantasma7.v=0;
            fantasma8.v=0;
            fantasma9.v=0;
            fantasma10.v=0;
            fantasma11.v=0;
            fantasma12.v=0;
            fantasma13.v=0;
            fantasma14.v=0;
            fantasma15.v=0;
            fantasma16.v=0;
            fantasma17.v=0;
            fantasma18.v=0;
            fantasma19.v=0;
            
            mensajeperder.setVisible(true);
            
            
        }
         
        return muerto;
    }
    
    
    @Override
    public void render(Graphics g) {
       g.drawImage(imagenfantasma, (int) (x-juego.getCamaraJuego().getAjusteX()), (int) (y-juego.getCamaraJuego().getAjusteY()),ancho,altura, null);
    }
}
