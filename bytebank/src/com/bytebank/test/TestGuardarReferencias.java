package com.bytebank.test;

import com.bytebank.modelo.*;
// import com.bytebank.modelo.Cliente;
// import com.bytebank.modelo.GuardarReferencias;

public class TestGuardarReferencias {

  public static void main(String[] args) {
    GuardarReferencias testGuardarReferencias = new GuardarReferencias();

    Object cuenta = new CuentaCorriente(300);
    testGuardarReferencias.adicionar(cuenta);

    System.out.println(testGuardarReferencias.obtener(0));

  }

}
