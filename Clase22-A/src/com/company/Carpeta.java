package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivo {

    private final String nombre;
    private final List<Archivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getFileType() {
        return this.getClass().getSimpleName();
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void addFile(Archivo a) {
        archivos.add(a);
    }

    public void showFiles() {
        for(Archivo file:archivos) {
            System.out.println(file.getNombre() + " es un: " + file.getFileType());
            if (file.getFileType().equals("Carpeta")) {
                Carpeta folder = (Carpeta) file;
                for (Archivo f:folder.getArchivos()) {
                    System.out.println(f.getNombre() + " es un: " + f.getFileType());
                }
            }
        }
    }

    public void removeFile(Archivo a) {
        if (a.getFileType().equals("Carpeta")) {
            Carpeta folder = (Carpeta) a;

            while(folder.getArchivos().size() > 0) {
                folder.getArchivos().remove(0);
            }

        }
        archivos.remove(a);
    }
}
