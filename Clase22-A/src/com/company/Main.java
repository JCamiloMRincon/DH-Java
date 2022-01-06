package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Texto miPrimerTxt = new Texto("miPrimerTxt");
        Texto miSegundoTxt = new Texto("miSegundoTxt");
        Texto miTercerTxt = new Texto("miTercerTxt");

        Video miPrimerVideo = new Video("miPrimerVideo");
        Video miSegundoVideo = new Video("miSegundoVideo");
        Video miTercerVideo = new Video("miTercerVideo");

        Video shrek = new Video("shrek");

        Carpeta carpetaRaiz = new Carpeta("carpetaRaíz");

        Carpeta textos = new Carpeta("textos");
        Carpeta videos = new Carpeta("videos");

        // peliculas.addFile(shrek);

        textos.addFile(miPrimerTxt);
        textos.addFile(miSegundoTxt);
        textos.addFile(miTercerTxt);

        // textos.showFiles();

        videos.addFile(miPrimerVideo);
        videos.addFile(miSegundoVideo);
        videos.addFile(miTercerVideo);

        // videos.showFiles();

        carpetaRaiz.addFile(textos);
        carpetaRaiz.addFile(videos);
        carpetaRaiz.showFiles();

        videos.removeFile(miTercerVideo);
        System.out.println("------");
        carpetaRaiz.showFiles();

        carpetaRaiz.removeFile(videos);
        System.out.println("------");
        carpetaRaiz.showFiles();

    }
}
