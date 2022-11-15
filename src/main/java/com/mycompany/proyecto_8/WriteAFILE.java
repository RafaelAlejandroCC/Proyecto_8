/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_8;

/**
 *
 * @author Rafael Alejandro
 * 
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteAFILE extends FileTest{
    
    public WriteAFILE(String fileN){
        this.wfiles(fileN);
    }
    
    private void wfiles (String fileN){
        
        try
        {
         FileWriter fw=new FileWriter(fileN);
         fw.write("esto es una prueba");
         fw.write(97);
         
         fw.close();
         
         FileReader fr=new FileReader (fileN);
         
         int valor=fr.read();
         while(valor!=-1){
             System.out.println((char)valor);
             valor=fr.read();
         }
         
         fr.close();
            
        }
        
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            
        }
    }
    
}
