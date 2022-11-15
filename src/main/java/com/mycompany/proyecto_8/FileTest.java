/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_8;


/**
 *
 * @author Rafael Alejandro
 */

import java.io.File;

public class FileTest {

    public static void main(String[] args) {
        String folder = "C:\\Users\\Rafael Alejandro>" ;
        File fl = new File(folder + "Scanner");
        fl.exists();
        System.out.println("fue un exito la operacion");
    }
}
