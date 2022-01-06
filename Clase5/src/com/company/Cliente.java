package com.company;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
    }

    public Double getDeuda() {
        return this.deuda;
    }

    public void incrementarDeuda(Double valor) {
        this.deuda += valor;
    }

    public void pagarDeuda() {
        this.deuda = 0.0;
    }
}
