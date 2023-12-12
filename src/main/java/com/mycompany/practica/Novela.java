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
public class Novela extends Libro {
    private String tipoNovela;
    private Scanner scanner;

    public Novela() {
        super();
        this.tipoNovela = "";
        this.scanner = new Scanner(System.in);
    }

    public Novela(String tipoNovela, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }

    public String getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }
    public Libro crearLibro() throws ParseException {
        Novela nuevo = new Novela();
        System.out.println("titulo");
        nuevo.setTitulo(scanner.nextLine());
        System.out.println("Autor");
        nuevo.setAutor(scanner.nextLine());
        System.out.println("Precio");
        nuevo.setPrecio(scanner.nextInt());
        scanner.nextLine();
        System.out.println("tipoNovela");
        nuevo.setTipoNovela(scanner.nextLine());
        return nuevo;
    }    
    
}
