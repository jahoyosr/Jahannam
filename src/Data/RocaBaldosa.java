/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.awt.image.BufferedImage;

/**
 *
 * @author Julian
 */
public class RocaBaldosa extends Baldosa{

    public RocaBaldosa(int id) {
        super(Imagenes.roca_base,id);
    }

       public boolean esSolido(){
           return true;
       }
   
       
}
