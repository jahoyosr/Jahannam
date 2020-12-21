/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Data.Entidades;
import UI.Juego;


public abstract class Criaturas extends Entidades{
    public static final int VIDA_DEFECTO=1;
    public static final float VELOCIDAD_DEFECTO=3f;
    public static final int ANCHO_CREATURA_DEFECTO=30;
    public static final int ALTURA_CREATURA_DEFECTO=30;
    protected int vida;
    protected float velocidad;
    protected float MovimientoX;
    protected float MovimientoY;


  
   
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getMovimientoX() {
        return MovimientoX;
    }

    public void setMovimientoX(float MovimientoX) {
        this.MovimientoX = MovimientoX;
    }

    public float getMovimientoY() {
        return MovimientoY;
    }

    public void setMovimientoY(float MovimientoY) {
        this.MovimientoY = MovimientoY;
    }
    
    
         
    public Criaturas(Juego juego,float x, float y, int ancho, int altura) {
        super(juego, x, y, ancho, altura);
       
        vida = VIDA_DEFECTO;
        velocidad=VELOCIDAD_DEFECTO;
        MovimientoX=0;
        MovimientoY=0;
    }
    
  
    
    
  
    
    
}

