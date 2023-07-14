package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.CuentaAhorros;
import java.util.ArrayList;

public class TestArrayList {

  public static void main(String[] args) {

    // <> (Generics) Forzando a que solo acepte solo un tipo de objeto
    ArrayList<Cuenta> lista = new ArrayList<>();
    Cuenta cc = new CuentaCorriente(1122);
    Cuenta cc2 = new CuentaAhorros(1122);
    Cuenta ca = new CuentaAhorros(12321);

    lista.add(cc);
    lista.add(cc2);
    lista.add(ca);

    // ya no es necesario castear porque ya estamos indicando que va a usar Cuenta
    Cuenta obtenerCuenta = lista.get(0);
    Cuenta obtenerCuenta2 = lista.get(1);

    System.out.println(obtenerCuenta);
    System.out.println(obtenerCuenta2);

    // for (int i = 0; i < lista.size(); i++) {
    // System.out.println(lista.get(i));
    // }

    // for each
    for (Cuenta cuenta : lista) {
      System.out.println(cuenta);
    }

    boolean contiene = lista.contains(cc2);

    // referencia

    if (contiene) {
      System.out.println("Si son iguales(equals)");
    }

    // if (contiene) {
    // System.out.println("Si contiene una referencia con este nombre");
    // }

    // valores
    // if (cc.esIgual(cc2)) {
    // System.out.println("Si existe una referencia con los mismos valores");
    // }

    // metodo equals

  }
}
