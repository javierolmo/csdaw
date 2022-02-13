/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio7;

/**
 *
 * @author ESTUDIOS
 */
public class PrismaRectangular_v3 implements Figura3D_v3 {
   private int base;
   private int altura;
   private int profundidad;
   
   public PrismaRectangular_v3(int base, int altura, int profundidad){
       this.base=base;
       this.altura=altura;
       this.profundidad=profundidad;
   }
    
    @Override
   public double volumen(){
     
       return base * altura * profundidad;
   }
}

