package com.bytebank.modelo;

public class GuardaCuentas {
  // Crar objeto para guardar cuentas
  // Permitir agregar cuentas con un metodo
  // GuardaCuentas.adiciona(cuenta)
  // obtener, remover, etc

  Cuenta[] arr = new Cuenta[10];
  int index = 0;

  public void adicionar(Cuenta cc) {
    arr[index] = cc;
    index++;
  }

  // Cuenta obtener indice

  public Cuenta obtener(int index) {
    return arr[index];
  }

}
