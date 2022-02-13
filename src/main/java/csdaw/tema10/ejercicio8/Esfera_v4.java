/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio8;

/**
 *
 * @author ESTUDIOS
 */
public class Esfera_v4 implements Figura3D_v4 {
    
    private double radio;
    
    public Esfera_v4(double radio) {
        this.radio = radio;
    }

    @Override
    public double volumen() {
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }

    @Override
    public double superficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    
}
