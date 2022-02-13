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
public abstract class PiezaAjedrez {
    
    private int fila;
    private int columna;
    
    /**
     * 
     * @param fila fila destino
     * @param columna columna destino
     * @return true si el movimiento se puede hacer y false en caso contrario
     */
    public abstract boolean mover(int fila, int columna);
    
    public void efectuarMovimiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    
    
}
