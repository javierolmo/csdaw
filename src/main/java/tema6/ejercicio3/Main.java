package tema6.ejercicio3;

public class Main {

    public static void main(String[] args) {

        CuentaCorriente cuentaCorriente = new CuentaCorriente("ABCDEFGHIJKLMNÑOPQRSTUVW");
        cuentaCorriente.setComision(0.5f, 1.20f);

        //TODO: Aquí implementar el menú con las opciones, como en otros ejercicios
        // Para hacer las operaciones de ingresar, retirar y consultar saldo se pueden utilizar las siguientes sentencias:
        cuentaCorriente.ingresar(50);
        cuentaCorriente.retirar(50);
        float saldo = cuentaCorriente.getSaldo();


    }

}
