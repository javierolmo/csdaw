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
public class TorreAjedrez_v2 extends PiezaAjedrez_v2 {

    @Override
    public boolean mover(int fila, int columna) {
        if(fila > 7 || fila < 0) return false;
        if(columna > 7 || columna < 0) return false;
        if(columna != this.getColumna() && fila != this.getFila()) return false;
        efectuarMovimiento(fila, columna);
        return true;
    }

    @Override
    public String toString() {
        return "T";
    }
  }
