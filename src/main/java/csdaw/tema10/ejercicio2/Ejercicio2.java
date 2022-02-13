/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdaw.tema10.ejercicio2;

/**
 *
 * @author ESTUDIOS
 */
public class Ejercicio2 {

    
    public static void main(String[] args) {
        Esfera_v1 esfera = new Esfera_v1(1);
        PrismaRectangular_v1 prismaRectangular = new PrismaRectangular_v1(5,10,12);
        double esf = esfera.volumen();
        double prisr = prismaRectangular.volumen();
        if (esf> prisr)
        System.out.printf("El volumen mayor es el de la ESFERA:%.2f",esf );
        else System.out.printf("El volumen mayor es el del PRISMA RECTANGULAR:%.2f",prisr);
    }
    
}
