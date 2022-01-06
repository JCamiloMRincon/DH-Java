package com.company;

public class CajaDeAhorros extends Cuenta {

    private double tasaDeInteres;

    public CajaDeAhorros(String numero, double tasaDeInteres) {
        super(numero);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres(){
        double interes = (getSaldo() * tasaDeInteres) / 100;
        System.out.println("El interes es de: " + interes);
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void extraerEfectivo(double importe) {
        if(importe <= getSaldo()){
            setSaldo(getSaldo() - importe);
        } else {
            System.out.println("El importe supera el saldo disponible");
        }
    }

}

