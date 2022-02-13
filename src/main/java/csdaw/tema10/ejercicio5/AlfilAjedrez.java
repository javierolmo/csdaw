/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio5;

/**
 *
 * @author ESTUDIOS
 */
public class AlfilAjedrez extends PiezaAjedrez {

    @Override
    public boolean mover(int fila, int columna) {
        if(fila > 7 || fila < 0) return false;
        if(columna > 7 || columna < 0) return false;
        
        int incrementoColumna = this.getColumna() - columna;
        int incrementoFila = this.getFila() - fila;
        
        boolean result = Math.abs(incrementoColumna) == Math.abs(incrementoFila);
        if(result) efectuarMovimiento(fila, columna);
        return result;
    }

    @Override
    public String toString() {
        return "A";
    }
    
    
    
}
