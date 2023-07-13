package com.bytebank.modelo;

public class GuardarReferencias {
  Object[] referencias = new Object[10];

  int index = 0;

  public void adicionar(Object ref) {
    referencias[index] = ref;
    index++;
  }

  public Object obtener(int index) {
    return referencias[index];
  }
}
