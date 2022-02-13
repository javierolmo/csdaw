/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio3;

/**
 *
 * @author ESTUDIOS
 */
public class Cilindro extends Figura3D_v2{
    
    private int radio;
    private int altura;

    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double superficie() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }
    
}
