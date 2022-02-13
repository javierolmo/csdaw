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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(10, 10);
        Esfera_v2 esfera = new Esfera_v2(10);
        PrismaRectangular_v2 prismaRectangular = new PrismaRectangular_v2(10, 10, 10);
        
        if(cilindro.superficie() > esfera.superficie() && cilindro.superficie() > prismaRectangular.superficie()) {
            System.out.printf("El cilindro tiene mayor superficie: %.2f", cilindro.superficie());
        } else if(esfera.superficie() > prismaRectangular.superficie()) {
            System.out.printf("La esfera tiene mayor superficie: %.2f", esfera.superficie());
        } else {
            System.out.printf("El prisma tiene mayor superficie: %.2f", prismaRectangular.superficie());
        }
    }
    
}
