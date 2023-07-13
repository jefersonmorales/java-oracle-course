package com.bytebank.test;

public class TestMain {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int[] edades = new int[5];
        edades[0] = 1;
        edades[1] = 2;
        edades[2] = 3;
        edades[3] = 4;
        edades[4] = 5;

        int indice = 3;

        int longitudArrays = edades.length;

        System.out.println("Indice: " + indice + ". Valor: " + edades[indice]);
        System.out.println("Longitud del Array de edades: " + longitudArrays);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Metodo for. Indice: " + i + ", Valor: " + edades[i]);
        }

    }
}
