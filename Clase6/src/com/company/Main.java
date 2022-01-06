package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        Perro pipo = new Perro(true, "Dobermann", 2015, 20.0, false, true, "pipo");
        System.out.println(pipo.getNombrePila() + " tiene " + pipo.preguntarEdad() + " anios.");

        System.out.println(pipo.getNombrePila() + " se puede perder? " + pipo.sePuedePerder());

        System.out.println(pipo.getNombrePila() + " puede ser enviado en adopcion? " + pipo.getEnAdopcion());

    }

}
