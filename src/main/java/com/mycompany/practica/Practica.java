/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jdelr
 */
public class Practica {

    public static void main(String[] args) throws ParseException {
        System.out.println("cant libros:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Libro> libros = new ArrayList<>();
        for(int i=0;i<num;i++){
            Libro libro = null;
            System.out.println("Tipo Libro");
            int tipo = scanner.nextInt();
            switch(tipo){
                case 1:
                    libro = new Academico().crearLibro();
                    break;
                case 2:
                    libro = new Novela().crearLibro();
                    break;
                case 3:
                    libro = new Texto().crearLibro();
                    break;
            }
            if(libro!= null){
                libros.add(libro);
            }  
        }
        System.out.println("Ingrese el título del libro a buscar:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String tituloBuscado = scanner.nextLine();
        
        Libro libroEncontrado = Libro.buscarLibroPorTitulo(libros, tituloBuscado);
        
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println("Título: " + libroEncontrado.getTitulo());
            System.out.println("Autor: " + libroEncontrado.getAutor());
            System.out.println("Precio: " + libroEncontrado.getPrecio());
        } else {
            System.out.println("Libro no encontrado.");
        } 
    }
}
