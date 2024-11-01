/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author User
 */
 public class Cuadrado extends Formas {
     
     public Cuadrado (){
         establecerColor("amarillo");
         establecerdibujar("dibujando un Cuadrado");
         this.lado = 4;
     }
    private final double lado;

    // Constructor para establecer el lado del cuadrado
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área del cuadrado
    public double calcularArea() {
        return lado * lado;
    }
}