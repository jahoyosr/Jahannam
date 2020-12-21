
package Data;

import UI.Juego;
import java.awt.Graphics;

public abstract class Entidades {
    protected Juego juego;
    protected Mundo mundo;
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    protected Baldosa baldosa;
    protected float x, y;
    protected int ancho, altura;
    
    public Entidades (Juego juego,float x, float y, int ancho, int altura){
      
        this.x =x;
        this.y = y;
        this.ancho =ancho;
        this.altura=altura;
        this.juego=juego;
    }
    
    public abstract void tick ();

    public int getAncho() {
        return ancho;
    }
    
    public void init(Mundo mundo){
        this.mundo=mundo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public abstract void render(Graphics g);
    
}

