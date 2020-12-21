/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Julian
 */
public class Baldosa {
    
    public static Baldosa[] baldosa = new Baldosa[10000];
    public static Baldosa rocaBaldosa = new RocaBaldosa(0);
    public static Baldosa pisoBaldosa = new PisoBaldosa(1); 
    
    
    
    public static final int ANCHO_BALDOSA=30;
    public static final int ALTURA_BALDOSA=30;
    protected BufferedImage texture;
    protected final int id;
    private boolean solido;
    
    public Baldosa(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;
        baldosa[id]=this;
    }
    
    
    public void tick(){
        
    }
    
    public Baldosa obtenerBaldosa(int posicion){
        return baldosa[posicion];
    }
    
    public void render(Graphics g, int x, int y){
       g.drawImage(texture, x, y, ANCHO_BALDOSA, ALTURA_BALDOSA, null);
        
    }
   
    
    public boolean esSolido(){
        return false;
    }
    
    public int getId(){
        return id;
    }
}
