/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_m2;

/**
 *
 * @author CESDE
 */
class Circulo extends FiguraGeometrica        {
    private double radio;
    private static final double PI = 3.14159265359;
    
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
        
    }
    
    @Override
    public double calcularArea() {
        return PI * radio * radio; 
    }
    
    
    
}
