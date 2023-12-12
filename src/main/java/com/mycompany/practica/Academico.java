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
public class Academico extends Libro {
    private String materia;
    private int grado;
    private Scanner scanner;

    public Academico() {
        super();
        this.materia = "";
        this.grado = 0;
        this.scanner = new Scanner(System.in);
    }

    public Academico(String materia, int grado, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.materia = materia;
        this.grado = grado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    } 
    public Libro crearLibro() throws ParseException {
        Academico nuevo = new Academico();
        System.out.println("titulo");
        nuevo.setTitulo(scanner.nextLine());
        System.out.println("Autor");
        nuevo.setAutor(scanner.nextLine());
        System.out.println("Precio");
        nuevo.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Materia");
        nuevo.setMateria(scanner.nextLine());
        System.out.println("Grado");
        nuevo.setGrado(scanner.nextInt());
        return nuevo;
    }
}
