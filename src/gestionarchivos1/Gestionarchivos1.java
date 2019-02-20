/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


        
public class Gestionarchivos1 {

    /**
     * @param args the command line arguments
     */
    private String ruta;

    public Gestionarchivos1(String ruta) {
        this.ruta = ruta;
    }
    
    public boolean guardar (ArrayList<Integer> bd) throws FileNotFoundException{
        PrintStream archivo = new PrintStream(new File(this.ruta));
        for(Integer value: bd){
            archivo.print(value);
            archivo.print(" ");    
        }
        archivo.flush();
        archivo.close();
        return true;
    }
       public ArrayList<Integer> cargar() throws FileNotFoundException{
       ArrayList<Integer> data = 
               new ArrayList<>();
       Scanner lectura = 
               new Scanner(new File(this.ruta));
       while(lectura.hasNextInt()){
          data.add(lectura.nextInt());
       }
       lectura.close();
       return data;
    }
    
}
