/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guillermopalazon.ut05gitpruebas;

/**
 *
 * @author Guillermo
 */
public class NombreCortoException extends RuntimeException {
    public String getMessage(){
        return "El nombre es muy corto, ahora mismo  y hasta luego Mari Carmen";
    }
}
