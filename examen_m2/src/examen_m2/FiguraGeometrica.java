/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_m2;

/**
 *
 * @author CESDE
 */
 abstract class FiguraGeometrica {
    protected String color; 

    public FiguraGeometrica(String color) {
        this.color = color;
    }
    abstract double calcularArea();
       
    }


