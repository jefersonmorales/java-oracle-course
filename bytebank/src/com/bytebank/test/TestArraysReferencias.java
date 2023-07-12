package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArraysReferencias {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(300);

        CuentaCorriente[] cuentas = new CuentaCorriente[5];
        cuentas[1] = cc;

        // System.out.println("Clase cuenta. " + cc);
        // System.out.println("Array. " + cuentas[1]);

        cuentas[0] = new CuentaCorriente(100);
        // System.out.println("Array. " + cuentas[0]);

        // System.out.println("Array. Posicion vacia (ejemplo): " + cuentas[3]);

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Indice # : " + i + ", Valor: " +  cuentas[i]);
        }

    }
}
