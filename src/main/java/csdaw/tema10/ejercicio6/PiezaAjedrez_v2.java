/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio6;

/**
 *
 * @author ESTUDIOS
 */
public abstract class PiezaAjedrez_v2 {
    
    private int fila;
    private int columna;

    public boolean moverV2(int fila, char columna) {
        int filaV1 = fila-1;
        int columnaV1 = 0;
        switch (columna) {
            case 'a': columnaV1 = 0; break;
            case 'b': columnaV1 = 1; break;
            case 'c': columnaV1 = 2; break;
            case 'd': columnaV1 = 3; break;
            case 'e': columnaV1 = 4; break;
            case 'f': columnaV1 = 5; break;
            case 'g': columnaV1 = 6; break;
            case 'h': columnaV1 = 7; break;
        }
        return mover(filaV1, columnaV1);
    }
    
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
