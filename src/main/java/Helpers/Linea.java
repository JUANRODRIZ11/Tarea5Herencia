/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author User
 */
 public class Linea extends Formas {
     
     public Linea (){
         establecerColor("azul");
         establecerdibujar("dibujando una linea");
         
         this.largo = 0;
     }
  
    private final double largo;

    // Constructor para establecer el largo de la línea
    public Linea(double largo) {
        this.largo = largo;
    }

    // Método para obtener el largo de la línea
    public double getLargo() {
        return largo;
    }
    
  
}