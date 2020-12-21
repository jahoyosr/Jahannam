/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.awt.image.BufferedImage;


public class Imagenes {

    public static BufferedImage getPlayer_right() {
        return player_right;
    }

    public static void setPlayer_right(BufferedImage player_right) {
        Imagenes.player_right = player_right;
    }

    public static BufferedImage getPlayer_left() {
        return player_left;
    }

    public static void setPlayer_left(BufferedImage player_left) {
        Imagenes.player_left = player_left;
    }

    public static BufferedImage getPlayer_up() {
        return player_up;
    }

    public static void setPlayer_up(BufferedImage player_up) {
        Imagenes.player_up = player_up;
    }

    public static BufferedImage getPlayer_down() {
        return player_down;
    }

    public static void setPlayer_down(BufferedImage player_down) {
        Imagenes.player_down = player_down;
    }

    public static BufferedImage getGhost_right() {
        return ghost_right;
    }

    public static void setGhost_right(BufferedImage ghost_right) {
        Imagenes.ghost_right = ghost_right;
    }

    public static BufferedImage getGhost_left() {
        return ghost_left;
    }

    public static void setGhost_left(BufferedImage ghost_left) {
        Imagenes.ghost_left = ghost_left;
    }

    public static BufferedImage getPlayer_right_1() {
        return player_right_1;
    }

    public static void setPlayer_right_1(BufferedImage player_right_1) {
        Imagenes.player_right_1 = player_right_1;
    }

    public static BufferedImage getPlayer_left_1() {
        return player_left_1;
    }

    public static void setPlayer_left_1(BufferedImage player_left_1) {
        Imagenes.player_left_1 = player_left_1;
    }

    public static BufferedImage getPlayer_up_1() {
        return player_up_1;
    }

    public static void setPlayer_up_1(BufferedImage player_up_1) {
        Imagenes.player_up_1 = player_up_1;
    }

    public static BufferedImage getPlayer_down_1() {
        return player_down_1;
    }

    public static void setPlayer_down_1(BufferedImage player_down_1) {
        Imagenes.player_down_1 = player_down_1;
    }

    public static BufferedImage getPlayer_right_2() {
        return player_right_2;
    }

    public static void setPlayer_right_2(BufferedImage player_right_2) {
        Imagenes.player_right_2 = player_right_2;
    }

    public static BufferedImage getPlayer_left_2() {
        return player_left_2;
    }

    public static void setPlayer_left_2(BufferedImage player_left_2) {
        Imagenes.player_left_2 = player_left_2;
    }

    public static BufferedImage getPlayer_up_2() {
        return player_up_2;
    }

    public static void setPlayer_up_2(BufferedImage player_up_2) {
        Imagenes.player_up_2 = player_up_2;
    }

    public static BufferedImage getPlayer_down_2() {
        return player_down_2;
    }

    public static void setPlayer_down_2(BufferedImage player_down_2) {
        Imagenes.player_down_2 = player_down_2;
    }

    
    
    public static BufferedImage player_right, player_left, player_up, player_down, ghost_right, ghost_left;
    public static BufferedImage player_right_1, player_left_1, player_up_1, player_down_1;
    public static BufferedImage player_right_2, player_left_2, player_up_2, player_down_2;
    public static BufferedImage piso_base, roca_base;
    
    
    public static void init(){
        Formato sheet = new Formato(CargaImagen.loadImage("/textures/Sprite-FULL.png"));
        
        ghost_right = sheet.crop(0,168,74,74);
        ghost_left = sheet.crop(0,243,74,74);
        
        player_right = sheet.crop(0,128,24,39);
        player_left = sheet.crop(0,88,24,39);
        player_up = sheet.crop(0,44,24,43);
        player_down = sheet.crop(0,0,24,43);
        
        player_right_1 = sheet.crop(24,128,26,39);
        player_left_1 = sheet.crop(24,88,25,39);
        player_up_1 = sheet.crop(24,44,26,43);
        player_down_1 = sheet.crop(24,0,25,43);
        
        player_right_2 = sheet.crop(50,128,24,39);
        player_left_2 = sheet.crop(49,88,25,39);
        player_up_2 = sheet.crop(50,44,24,43);
        player_down_2 = sheet.crop(49,0,25,43);
        
      
        Formato piso = new Formato(CargaImagen.loadImage("/textures/BaldosaPiso.png"));
        piso_base = piso.crop(0, 0, 70, 70);
        
        Formato roca = new Formato(CargaImagen.loadImage("/textures/BaldosaRoca.png"));
        roca_base = roca.crop(0, 0, 70, 70);
         
        
    }
    
}

