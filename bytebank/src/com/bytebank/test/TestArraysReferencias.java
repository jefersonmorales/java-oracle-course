package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArraysReferencias {
    public static void main(String[] args) {

        Object[] referencias = new Object[5]; // creacion de array

        CuentaCorriente cuentaAhorros1 = new CuentaCorriente(300); // instancia de una cuenta de ahorros # 1

        referencias[1] = cuentaAhorros1; // agregando referencia en array

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente obtenido = (Cliente) referencias[4];
        System.out.println(obtenido);

        CuentaAhorros cuentaAhorros2 = new CuentaAhorros(1300); // instancia de una cuenta ahorros # 2
        referencias[3] = cuentaAhorros2; // agregando referencia en array

        referencias[0] = new CuentaCorriente(100); // instancia de una cuenta corriente y agregando al array

        CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
        System.out.println(cuenta);

        for (int i = 0; i < referencias.length; i++) {
            System.out.println("Indice # : " + i + ", Valor: " + referencias[i]);
        }

    }
}
