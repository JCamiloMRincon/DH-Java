package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empresa {

    private List<Reserva> reservas;

    public Empresa() { reservas = new ArrayList<>(); }

    public void addReserva(Reserva res) { reservas.add(res); }

    public double recaudacionTotal() {
        double recaudacion = 0.0;
        for (Reserva res : reservas) {
            recaudacion += res.getPrecio();
        }
        return recaudacion;
    }

    public int cantVecesRecorrida(String est) throws Exception {
        List<String> estaciones = Arrays.asList("Buenos Aires", "Luján", "Mercedes", "Suipacha",
                                                "Chivilcoy", "Alberti", "Bragado");

        if(estaciones.contains(est)) {
            int cantPersonas = 0;
            for (Reserva res : reservas) {
                if (res.getEstacionOrigen().equals(est) || res.getEstacionDestino().equals(est))
                    cantPersonas += res.getCantViajeros();
            }
            return cantPersonas;
        } else {
            throw new Exception("La estación no existe");
        }

    }
}
