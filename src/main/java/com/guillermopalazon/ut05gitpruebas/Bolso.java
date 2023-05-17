/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guillermopalazon.ut05gitpruebas;

/**
 *
 * @author Guillermo
 */
public class Bolso {
    private String codigo;
    private MarcasBolso marca;
    private int numeroBolso;
    
    public Bolso(String codigo, MarcasBolso marca, int numeroBolso) {
        this.codigo = codigo;
        this.marca = marca;
        this.numeroBolso = numeroBolso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void muestraInfo(){
        System.out.println("Hola");
    }
    
    
}
