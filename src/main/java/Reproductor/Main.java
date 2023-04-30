/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jesus Alberto
 */
public class Main {
    public static void main(String[] args) {
        
        ListaCancionOrdenada lco = new ListaCancionOrdenada();
        
        
        String archivo = "C:\\Users\\Jesus Alberto\\Desktop\\22 Programación III\\Canciones.txt";

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
            lco.insertar(new Cancion("C:\\Users\\Jesus Alberto\\Desktop\\22 Programación III",linea));

            }

            br.close();
            fr.close();


        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
         lco.Switch();
        
        System.out.println("fin");
        
        

    }

    }

