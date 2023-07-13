package com.bytebank.test;

import java.util.ArrayList;

public class TestListasArrayList {

  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>(3);
    lista.add("hola");
    lista.add("hi");
    lista.add("hello");

    ArrayList<String> nueva = new ArrayList<>(lista);

    nueva.add("bienvenido");

    for (int i = 0; i < lista.size(); i++) {
      System.out.println("Primera lista: " + lista.get(i));
    }

    for (int i = 0; i < nueva.size(); i++) {
      System.out.println("Nueva lista: " + nueva.get(i));
    }

  }
}
