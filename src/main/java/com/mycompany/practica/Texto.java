/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author jdelr
 */
public class Texto extends Libro{
    private String escuela;
    private Scanner scanner;

    public Texto() {
        this.escuela = "";
        this.scanner = new Scanner(System.in);
    }

    public Texto(String escuela, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public Libro crearLibro() throws ParseException {
        Texto nuevo = new Texto();
        System.out.println("titulo");
        nuevo.setTitulo(scanner.nextLine());
        System.out.println("Autor");
        nuevo.setAutor(scanner.nextLine());
        System.out.println("Precio");
        nuevo.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Escuela");
        nuevo.setEscuela(scanner.nextLine());
        return nuevo;
    }    
    
    
}
