package csdaw.tema9.ejercicio12;

import java.time.LocalDate;
import java.util.Objects;

public class Bicicleta {

    private String marca;
    private String modelo;
    private double precio;
    private double descuento;
    private LocalDate finDescuento;

    public Bicicleta() {
        this.finDescuento = LocalDate.now();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(marca, bicicleta.marca) && Objects.equals(modelo, bicicleta.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, precio, descuento);
    }

    public void fijarDescuento() {
        this.descuento = 0.10;
        this.finDescuento = LocalDate.now().plusMonths(1);
    }

    public void fijarDescuento(double d) {
        this.descuento = d;
        this.finDescuento = LocalDate.now().plusMonths(1);
    }

    public void fijarDescuento(double d, int n) {
        this.descuento = d;
        this.finDescuento = LocalDate.now().plusMonths(n);
    }

    public double precioConDescuento() {
        if (descuento > 0 && finDescuento.isAfter(LocalDate.now())) {
            return precio - (precio * descuento);
        } else {
            return precio;
        }
    }
}
