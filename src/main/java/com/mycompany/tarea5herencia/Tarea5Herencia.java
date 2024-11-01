/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea5herencia;

import Helpers.Circulo;
import Helpers.Cuadrado;
import Helpers.Linea;
import Helpers.Triangulo;

/**
 *
 * @author User
 */
public class Tarea5Herencia {
    
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado= new Cuadrado();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        
        
        System.out.println("FORMAS");
        
        circulo.imprimirInformacion();
        cuadrado.imprimirInformacion();
        linea.imprimirInformacion();
        triangulo.imprimirInformacion();
        
        
        
        
        
    }
}

        