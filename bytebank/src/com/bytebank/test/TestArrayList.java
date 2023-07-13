package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.CuentaAhorros;
import java.util.ArrayList;

public class TestArrayList {

  public static void main(String[] args) {

    ArrayList lista = new ArrayList();
    Cuenta cc = new CuentaCorriente(1122);
    Cuenta ca = new CuentaAhorros(12321);

    lista.add(cc);
    lista.add(ca);

    Cuenta obtenerCuenta = (Cuenta) lista.get(0);
    Cuenta obtenerCuenta2 = (Cuenta) lista.get(1);

    System.out.println(obtenerCuenta);
    System.out.println(obtenerCuenta2);
    // System.out.println(lista.get(0));
    // System.out.println(lista.get(1));

  }

}
