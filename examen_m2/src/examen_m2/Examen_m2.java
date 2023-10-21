/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_m2;

/**
 *
 * @author CESDE
 */
public class Examen_m2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5, "rojo");
        Circulo circulo = new Circulo(3, "verde");
        
        System.out.println("Area del cuadrado " + cuadrado.calcularArea() + "Unidades cuadradas");
        System.out.println("Area del circulo: " + circulo.calcularArea() + "Unidades cuadradas");
        
    }
    
}
