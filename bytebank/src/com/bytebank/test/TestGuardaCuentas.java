package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestGuardaCuentas {

  public static void main(String[] args) {

    GuardaCuentas guardaCuentas = new GuardaCuentas();
    Cuenta cc = new CuentaCorriente(300);
    guardaCuentas.adicionar(cc);

    Cuenta cc2 = new CuentaCorriente(200);
    guardaCuentas.adicionar(cc2);

    System.out.println(guardaCuentas.obtener(0));
    System.out.println(guardaCuentas.obtener(1));

  }

}
