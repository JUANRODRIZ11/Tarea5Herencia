/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author User
 */
public  class Formas {

    private String color;
    private String dibujar;
    private int radio;
    private int areaTriangulo;
    private int  areaCuadrado;
    
    // Método para mostrar dibujo
    public void dibujar (String dibujar) {
        String dibujo = null;
        System.out.println("El dibujo de la forma es " + dibujo);
    }
    
    public Formas (){
        //Constructor vacío
    }
    
    // Método para establecer el color
    public void establecerColor(String color) {
        this.color=color;
    }
    public String obtenerColor(String color) {
        return this.color;
    }
    // Método para establecer el color
    public void establecerdibujar(String dibujar) {
        this.dibujar=dibujar;
    }
    public String obtenerdibujar(String dibujar) {
        return this.dibujar;
    }
     // Método para establecer el radio
    public void establecerradio(int radio) {
        this.radio=radio;
    }
    public int obtenerradio(int radio) {
        return this.radio;
    }
 // Método para establecer el area del Triangulo
    public void establecerareaTriangulo(int areaTriangulo) {
        this.areaTriangulo=areaTriangulo;
    }
    public int obtenerareaTriangulo(int areaTriangulo) {
        return this.areaTriangulo;
    }
    // Método para establecer el Area del cuadrado
    public void establecerareaCuadrado(int areaCuadrado) {
        this.areaCuadrado=areaCuadrado;
    }
    public int obtenerareaCuadrado(int areaCuadrado) {
        return this.areaCuadrado;
    }

    
   public void imprimirInformacion(){
       System.out.println("COLOR      " +color);
       System.out.println("DIBUJANDO     " +dibujar);
       
    
   }
}
