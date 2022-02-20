package csdaw.tema11.pClasesApoyo.pMates;

class CalculadoraPro extends Calculadora {

    // No podemos hacer super.sumar() porque se trata de un método privado, sólo accesible desde la propia clase
    // No hay @Override porque no se tiene visibilidad del método de la clase padre. Si se pusiera, daría error
    public String sumar() {
        int sumaInt = 0;
        for (Integer entero : super.enteros) {
            sumaInt += entero;
        }
        return Integer.toHexString(sumaInt);
    }

    // En este caso sí que se puede llamar a super.menor() porque este método de la clase padre es protected, lo que permite acceder a él desde clases hijas
    public int menor() {
        int menor = super.menor();
        return menor < 0? 0 : menor;
    }

}
