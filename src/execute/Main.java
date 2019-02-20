/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execute;

import gestionarchivos1.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dmadero
 */
public class Main {
    public static void main(String[] args) {
        DAO bd = new DAO();
        System.out.println("Gestion de enteros");
        Gui gui = new Gui();
        int opcion = 0, valor=0, posicion =0;
        Gestionarchivos1 archivos = new Gestionarchivos1("enteros.txt");
        Scanner lectura = new Scanner(System.in);
        while(true){
            opcion = gui.menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese dato");
                    valor = lectura.nextInt();
                    bd.AddBd(valor);
                    break;
                case 2:
                    System.out.println("Guardando");
                    try {
                        archivos.guardar(bd.getBd());
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
           
           
                    break;
                case 3:
                    System.out.println("Cargando archivo");
                    ArrayList <Integer> respaldo = null;
                    try {
                        respaldo = archivos.cargar();
                    }catch(FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    bd.setBd(respaldo);
                    break;
                case 4:
                    System.out.println("Lista");
                    gui.listar(bd.getBd());
                    break;
                case 5:
                    System.out.println("ingrese posicion");
                    posicion = lectura.nextInt();
                    System.out.println("Ingrese numero");
                    try{
                        archivos.guardar(bd.getBd());
                        
                    }catch(Exception e){
                        
                    }
                    break;
                    
            }
        }
    }
}
