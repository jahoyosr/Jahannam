/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Data.*;
import Bussiness.*;
import UI.Juego;
import UI.MensajeGanar;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Jugador extends Criaturas{
       

   
   protected int dir=0;
   private int animacion=0;
   private BufferedImage imagenes;
   private boolean caminando=false;
   MensajeGanar mensajeganar=new MensajeGanar();
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
 
     public Jugador(Juego juego, float x, float y) {
         super(juego, x, y, 28,28);
       
        
    }
   

    
   
    public void getEntrada(){
         MovimientoX=0;
         MovimientoY=0;
          if(animacion<10000) {
              animacion++;
          } else{
              animacion =0;
          }   
        if(juego.getKeyManager().up){
            
             MovimientoY=-velocidad;    
            
           
        }
         if(juego.getKeyManager().down){
          
               MovimientoY=velocidad;  
             
        }
          if(juego.getKeyManager().left){
             
               MovimientoX=-velocidad;    
              
           
        }
           if(juego.getKeyManager().right){
               
                MovimientoX=velocidad;   
               
            
        }
           int Xb,Yb;
       Xb =(int)MovimientoX;
       Yb =(int)MovimientoY;
       movimiento(Xb,Yb);
       movimientoanim(Xb,Yb);
       
    }
    
      public void movimiento(int MovimientoX, int MovimientoY){
          if(MovimientoX!=0 &&MovimientoY!=0){
              caminando=true;
              movimiento(MovimientoX,0);
              movimiento(0,MovimientoY);
             return;
          }else{
              caminando=false;
          }
          
          if(MovimientoX>0)dir=1;
          if(MovimientoY<0)dir=2;
          if(MovimientoY>0)dir=3;
          if(MovimientoX<0)dir=0;
       if(!enColision(MovimientoX,MovimientoY)){
          x += MovimientoX;  
          y += MovimientoY;   
       }
       

    }
      public void movimientoanim(int MovimientoX, int MovimientoY){
          if(MovimientoX!=0 ||MovimientoY!=0){
              caminando=true;
          }else{
              caminando=false;
          }
      }
  private boolean enColision(int MovimientoX,int MovimientoY){
        boolean solido=false;
        int Xc,Yc;
        Xc=(int)x;
        Yc=(int)y;
        for(int c=0; c<4;c++){
         int xt=(((Xc+MovimientoX)+c%2*12+8)/30);  
         int yt=(((Yc+MovimientoY)+c/2*16+10)/30);
         if(mundo.obtenerBaldosa(xt,yt).esSolido())solido=true;
        }
        
       
     
     
        return solido;
    }
    
    public void ganar(float Xg){
        if(Xg>1170){
          velocidad=0;
          mensajeganar.setVisible(true);
        }
        
    }
    
    
    
    @Override
    public void tick() {
      
        
        getEntrada();
        juego.getCamaraJuego().centrarEnJugador(this);
        ganar(x);
        
     }
  
    @Override
    public void render(Graphics g) {
        
          
        if(dir==0){
            imagenes=Imagenes.player_left;
            if(caminando){
                if(animacion%20>10) {
                    imagenes=Imagenes.player_left_1;
                }else{
                    imagenes=Imagenes.player_left_2;
                }
             }
                 
        }
        
          if(dir==1){
            imagenes=Imagenes.player_right;
            if(caminando){
                if(animacion%20>10) {
                    imagenes=Imagenes.player_right_1;
                }else{
                    imagenes=Imagenes.player_right_2;
                }
             }
                 
        }
      
        if(dir==2){
            imagenes=Imagenes.player_up;
            if(caminando){
                if(animacion%20>10) {
                    imagenes=Imagenes.player_up_1;
                }else{
                    imagenes=Imagenes.player_up_2;
                }
             }
            
        }
        if(dir==3){
            imagenes=Imagenes.player_down;
            if(caminando){
                if(animacion%20>10) {
                    imagenes=Imagenes.player_down_1;
                }else{
                    imagenes=Imagenes.player_down_2;
                }
             }
            
        }
        g.drawImage(imagenes, (int) (x-juego.getCamaraJuego().getAjusteX()), (int) (y-juego.getCamaraJuego().getAjusteY()),ancho,altura, null);
    }
    
}

