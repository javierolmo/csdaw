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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(10, 10);
        Esfera_v4 esfera = new Esfera_v4(10);
        PrismaRectangular_v4 prismaRectangular = new PrismaRectangular_v4(10, 10, 10);
        
        if(cilindro.superficie() > esfera.superficie() && cilindro.superficie() > prismaRectangular.superficie()) {
            System.out.printf("El cilindro tiene mayor superficie: %.2f", cilindro.superficie());
        } else if(esfera.superficie() > prismaRectangular.superficie()) {
            System.out.printf("La esfera tiene mayor superficie: %.2f", esfera.superficie());
        } else {
            System.out.printf("El prisma tiene mayor superficie: %.2f", prismaRectangular.superficie());
        }

        /* Cuestión 1:
        Sí, se produce un error. Las clases que implementan la interfaz están obligadas a implementar
        también sus métodos, y al haber uno nuevo deben implementarlo también. Para evitar este error
        podemos crear una implementación por defecto en la interfaz, de manera que si no se implementa
        en las clases asociadas a esta interfaz utilizarán la definición por defecto
         */

        /* Cuestión 2:
        Como se comentaba en la cuestión anterior, se puede crear una implementación por defecto ya que será igual para
        las tres clases. Tendrá que recurrir al método volumen() común a las tres y devolver el boolean correspondiente.
         */
    }

}
