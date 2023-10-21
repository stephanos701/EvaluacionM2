/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_m2;

import java.util.Scanner;

/**
 *
 * @author CESDE
 */
abstract class Cuadrado extends FiguraGeometrica {

    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = (int) lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

}
