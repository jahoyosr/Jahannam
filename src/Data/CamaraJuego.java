/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import UI.Juego;

/**
 *
 * @author Julian
 */
public class CamaraJuego {
    private Juego juego;
    private float AjusteX, AjusteY;
    public CamaraJuego(Juego juego,float AjusteX,float AjusteY){
        this.juego=juego;
        this.AjusteX=AjusteX;
        this.AjusteY=AjusteY;
        
    }
    
    public void centrarEnJugador(Entidades e){        
        AjusteX=e.getX()-juego.getAncho()/2 + e.getAncho()/2;
        AjusteY=e.getY()-juego.getAltura()/2 + e.getAltura()/2; 
    }
    
    public void movimiento(float CantidadX,float CantidadY){
        AjusteX+=CantidadX;
        AjusteY+=CantidadY;
    }

    public float getAjusteX() {
        return AjusteX;
    }

    public void setAjusteX(float AjusteX) {
        this.AjusteX = AjusteX;
    }

    public float getAjusteY() {
        return AjusteY;
    }

    public void setAjusteY(float AjusteY) {
        this.AjusteY = AjusteY;
    }
    
}
