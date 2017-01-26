/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.precedimientos.y.funciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileReader;
 
   
import java.time.LocalDate;
public class RepasoPrecedimientosYFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String nombre= "alejo";
    
    imprimir();

     
    }
  
    public static void imprimir ()
    {
     try{
    File f = new File("C:\\Users\\Tomas Calle\\Desktop\\f.txt");
    FileReader o = new FileReader(f);
    BufferedReader b = new BufferedReader(o);
    
   System.out.println(b.read()); 

      b.close();
     } 
       catch(IOException e) {
}
    }
    
    
}
