/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Julian
 */
public class Utilidad {
    
    public static String cargarArchivoComoString(String path){
        StringBuilder builder = new StringBuilder();
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String linea;
            while((linea = br.readLine())!=null){
                builder.append(linea+"\n");
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
            
         }
        return builder.toString();
     }
    
    public static int parseInt(String number){
        try{
            return Integer.parseInt(number);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }
}