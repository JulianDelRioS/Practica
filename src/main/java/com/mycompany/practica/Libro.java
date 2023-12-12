/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jdelr
 */
public abstract class Libro {
    private String titulo;
    private String autor;
    private int precio;
    private Scanner scanner;
    
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.precio = 0;
        this.scanner = new Scanner(System.in);
    }

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public abstract Libro crearLibro() throws ParseException;
    
    public static Libro buscarLibroPorTitulo(ArrayList<Libro> listaLibros, String tituloBuscado) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                return libro;
            }
        }
        return null;
    }
}
