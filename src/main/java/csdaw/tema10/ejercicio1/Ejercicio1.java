/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIOS
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Apartado tercero:
        // Si las clases hijas no tuviesen implementado el método area() daría un error de compilación,
        // porque los métodos abstractos es obligatorio instanciarlos en las clases hijas a no ser que sean abstractas.
        
        ArrayList<Figura2D_v9> arrayList = new ArrayList<>();
        arrayList.add(new Triangulo_v9(10, "Triangulo"));
        arrayList.add(new TrianColor_v9(10, 10, "Isósceles", "Rojo", "TrianColor"));
        
        for (Figura2D_v9 figura2D : arrayList) {
            System.out.printf("Nombre: %s | precio: %f", figura2D.getNombre(), figura2D.precio(10f));
        }
    }
    
}
