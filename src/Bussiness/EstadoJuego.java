/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.*;
import UI.Juego;

import java.awt.Graphics;


public class EstadoJuego extends Estado{
   
    public Jugador getPlayer() {
        return player;
    }

    public void setPlayer(Jugador player) {
        this.player = player;
    }

    private Jugador player;
    private Mundo mundo;
    public Fantasmas fantasma,fantasma1, fantasma2, fantasma3, fantasma4, fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19;
    public EstadoJuego(Juego juego){
        super(juego);
        
        player = new Jugador(juego,-30,90);
        mundo = new Mundo(juego, "res/Mundos/Mundo1.txt");
        player.init(mundo);
        fantasma= new Fantasmas(juego,30,30);
        fantasma1= new Fantasmas(juego,30,390);
        fantasma2= new Fantasmas(juego,30,750);
        fantasma3= new Fantasmas(juego,30,1110);
        fantasma4= new Fantasmas(juego,600,30);
        fantasma5= new Fantasmas(juego,600,390);
        fantasma6= new Fantasmas(juego,600,750);
        fantasma7= new Fantasmas(juego,600,1110);
        fantasma8= new Fantasmas(juego,30,60);
        fantasma9= new Fantasmas(juego,390,30);
        fantasma10= new Fantasmas(juego,750,30);
        fantasma11= new Fantasmas(juego,1110,30);
        fantasma12= new Fantasmas(juego,30,600);
        fantasma13= new Fantasmas(juego,390,600);
        fantasma14= new Fantasmas(juego,750,600);
        fantasma15= new Fantasmas(juego,1110,600);
        fantasma16= new Fantasmas(juego,60,60);
        fantasma17= new Fantasmas(juego,30,600);
        fantasma18= new Fantasmas(juego,600,30);
        fantasma19= new Fantasmas(juego,600,600);
        
    }

    
    @Override
    public void tick() {
        mundo.tick();
        player.tick();
        fantasma.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma1.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma2.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma3.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma4.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma5.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma6.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma7.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma8.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma9.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma10.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma11.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma12.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma13.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma14.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma15.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma16.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma17.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma18.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma19.eliminado(player,fantasma,fantasma1,fantasma2,fantasma3,fantasma4,fantasma5,fantasma6,fantasma7,fantasma8,fantasma9,fantasma10,fantasma11,fantasma12,fantasma13,fantasma14,fantasma15,fantasma16,fantasma17,fantasma18,fantasma19);
        fantasma.movimientoHorizontalFantasma(30);
        fantasma1.movimientoHorizontalFantasma(30);
        fantasma2.movimientoHorizontalFantasma(30);
        fantasma3.movimientoHorizontalFantasma(30);
        fantasma4.movimientoHorizontalFantasma(600);
        fantasma5.movimientoHorizontalFantasma(600);
        fantasma6.movimientoHorizontalFantasma(600);
        fantasma7.movimientoHorizontalFantasma(600);
        fantasma8.movimientoVerticalFantasma(60);
        fantasma9.movimientoVerticalFantasma(30);
        fantasma10.movimientoVerticalFantasma(30);
        fantasma11.movimientoVerticalFantasma(30);
        fantasma12.movimientoVerticalFantasma(600);
        fantasma13.movimientoVerticalFantasma(600);
        fantasma14.movimientoVerticalFantasma(600);
        fantasma15.movimientoVerticalFantasma(600);
        fantasma16.movimientoDiagonalFantasma(60, 60);
        fantasma17.movimientoDiagonalFantasma(30,600);
        fantasma18.movimientoDiagonalFantasma(600,30);
        fantasma19.movimientoDiagonalFantasma(600,600);
        
        
        
    }

    @Override
    public void render(Graphics g) {
        mundo.render(g);
        player.render(g);
        fantasma.render(g);
        fantasma1.render(g);
        fantasma2.render(g);
        fantasma3.render(g);
        fantasma4.render(g);
        fantasma5.render(g);
        fantasma6.render(g);
        fantasma7.render(g);
        fantasma8.render(g);
        fantasma9.render(g);
        fantasma10.render(g);
        fantasma11.render(g);
        fantasma12.render(g);
        fantasma13.render(g);
        fantasma14.render(g);
        fantasma15.render(g);
        fantasma16.render(g);
        fantasma17.render(g);
        fantasma18.render(g);
        fantasma19.render(g);
        }
    
    
}
