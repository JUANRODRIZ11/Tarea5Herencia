/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author User
 */
 public class Triangulo extends Formas {
     public Triangulo (){
         establecerColor("rojo");
         establecerdibujar("dibujando un triángulo");
         
         this.angulo = 90;
     }
   
    private final double angulo;

    // Constructor para establecer el ángulo del triángulo
    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    // Método para calcular el área del triángulo (ejemplo simple con altura = base = 1)
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
        
    }
    

}
