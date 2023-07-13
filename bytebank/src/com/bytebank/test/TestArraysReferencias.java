package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArraysReferencias {
    public static void main(String[] args) {

        CuentaCorriente cuentaAhorros1 = new CuentaCorriente(300); // instancia de una cuenta de ahorros # 1

        Cuenta[] cuentas = new Cuenta[5]; // creacion de array
        cuentas[1] = cuentaAhorros1; // agregando referencia en array

        CuentaAhorros cuentaAhorros2 = new CuentaAhorros(1300); // instancia de una cuenta ahorros # 2
        cuentas[3] = cuentaAhorros2; // agregando referencia en array

        cuentas[0] = new CuentaCorriente(100); // instancia de una cuenta corriente y agregando al array

        CuentaCorriente cuenta = (CuentaCorriente) cuentas[1];
        System.out.println(cuenta);

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Indice # : " + i + ", Valor: " + cuentas[i]);
        }

    }
}
