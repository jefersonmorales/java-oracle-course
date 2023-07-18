package com.conversor.modelo;

public class Mensajes {

  protected void mensajeSaludo() {
    System.out.println();
    System.out.println("*****Bienvenido*****");
    System.out.println();
  }

  protected void mensajeDespedida() {
    System.out.println();
    System.out.println("*****Hasta pronto...*****");
    System.out.println();
  }

  protected void revisarInformacion() {
    System.out.println("Los datos ingresados no son validos. Revise su informacion.");
    System.err.println();
    System.out.println("*Medidas permitidas:");
    System.out.println("  -centimetros");
    System.out.println("  -metros");
    System.out.println("*El valor debe ser mayor a 0");
  }

  protected void resultadoConversion(double valorResultado, String medidaResultado) {
    System.err.println("--------------------------------");
    System.out.println("Datos ingresados:");
    System.err.println();
    System.out.println("  -Numero: " + valorResultado);
    System.out.println("  -Medida: " + medidaResultado);
    System.err.println("--------------------------------");
    System.err.println();
    System.out.println("Resultado de la conversion: " + valorResultado + " " + medidaResultado);
    System.err.println();
  }

  protected void medidaConvertirInvalido() {
    System.out.println(
        "Debe ingresar un numero mayor a 0 y debe ingresar una unidad de medida valida (centimetros o metros)");
  }

}
