package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
    String[] nombres = {"FsNeru","Diovan","Trixie"};

    concantenarNombres(nombres);

    }

    private static void concantenarNombres(String[] nombres) {
        String nombresConcatenados = "";
        for(int i = 0; i < nombres.length; i++){
            nombresConcatenados += nombres[i] + " ";

        }

        System.out.println(nombresConcatenados);

    }

}
