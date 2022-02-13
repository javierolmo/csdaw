/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ESTUDIOS
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         PiezaAjedrez piezaAjedrez = null;
         
         System.out.println("Qué tipo de figura quieres utilizar?");
            System.out.println(" 1. Torre");
            System.out.println(" 2. Alfil");
            System.out.print("Introduce tu elección: (1 ó 2)");
            int eleccionFigura = scanner.nextInt();
            if(eleccionFigura == 1) {
                piezaAjedrez = new TorreAjedrez();
            } else if(eleccionFigura == 2) {
                piezaAjedrez = new AlfilAjedrez();
            }
             
         while(true) {
             
             
             System.out.println("Hacia dónde te quieres mover?");
             System.out.print("Fila: ");
             int eleccionFila = scanner.nextInt();
             System.out.print("Columna: ");
             int eleccionColumna = scanner.nextInt();
             boolean movimiento = piezaAjedrez.mover(eleccionFila, eleccionColumna);
             imprimirTablero(piezaAjedrez);
             
             System.out.printf("El movimiento es %s\n", (movimiento? "correcto" : "incorrecto") );
             System.out.println("Continuar jugando? (0 para continuar, -1 para detener)");
             int eleccionSeguir = scanner.nextInt();
             if(eleccionSeguir == -1) return;
             System.out.println("---------------------------------------------");
                
         }
    }
    
    public static void imprimirTablero(PiezaAjedrez piezaAjedrez) {
        String[][] tablero = new String[8][8];
        tablero[piezaAjedrez.getFila()][piezaAjedrez.getColumna()] = piezaAjedrez.toString();
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++){
                String pieza;
                if(tablero[i][j] == null) {
                    pieza = " ";
                } else {
                    pieza = tablero[i][j].toString();
                }
                System.out.printf("| %s ", pieza);
            }
            System.out.println("|\n---------------------------------");
        }
    }
    
}
