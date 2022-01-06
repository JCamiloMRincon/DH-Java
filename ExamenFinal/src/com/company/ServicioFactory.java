package com.company;

public class ServicioFactory {

    private static ServicioFactory factory = null;
    public static final String SIMPLE = "Servicio Simple";
    public static final String COMBO = "Servicio Combo";


    private ServicioFactory() {}

    public static ServicioFactory getInstance() {
        if (factory == null)
            factory = new ServicioFactory();

        return factory;
    }

    public Servicio cargarServicio(String tipoServicio) {

        switch(tipoServicio) {
            case ServicioFactory.SIMPLE:
                return new Simple();
            case ServicioFactory.COMBO:
                return new Combo();
        }
        return null;

    }

}
