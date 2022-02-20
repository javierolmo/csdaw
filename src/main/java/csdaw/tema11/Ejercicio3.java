package csdaw.tema11;

import csdaw.tema11.pClasesApoyo.Dado;

public class Ejercicio3 {

    public static void main(String[] args) {

        int resultado = Dado.lanzar();
        System.out.println("Resultado lanzamiento dado: " + resultado);
        // No hay ningún problema de acceso

        // DadoFalso dadoFalso = new DadoFalso();
        // No se puede acceder a la clase DadoFalso, ya que tiene acceso default, sólo es accesible desde el mismo paquete

        // Las dos opciones que se plantean en el ejercicio son válidas:
        // 1. Si la clase 'Ejercicio3' estuviera en el mismo paquete que 'DadoFalso' se podría acceder a su método lanzar() ya que es público
        // 2. Si la clase 'DadoFalso' fuera pública también se podría ejecutar ya que se podría acceder desde cualquier lugar y su método es accesible también.
        // Cabe mencionar que en el enunciado no se especifica que el método lanzar() tenga que ser estático como en la clase 'Dado', por lo que habría que crear una instancia de la clase y sobre ella invocar al método.

    }

}
