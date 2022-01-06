package com.company;

public class HabilidadFactory {

    private static HabilidadFactory factory = null;
    public static final String SIMPLE = "Habilidad Simple";
    public static final String COMBINADA = "Habilidad Combinada";

    private HabilidadFactory() {}

    public static HabilidadFactory getInstance() {
        if (factory == null)
            factory = new HabilidadFactory();

        return factory;
    }

    public Habilidad cargarHabilidad(String tipoHabilidad) {

        switch(tipoHabilidad) {
            case HabilidadFactory.SIMPLE:
                return new Simple();
            case HabilidadFactory.COMBINADA:
                return new Combinada();
        }
        return null;

    }

}
