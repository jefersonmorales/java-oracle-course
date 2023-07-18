package com.conversor.modelo;

public class Conversor extends Mensajes {

  protected String medidaConvertida;
  protected String medidaConvertir;
  protected double valueInput;
  protected double valueConverted;
  public boolean status;

  public double cm = 100;
  public double m = 0.01;

  public Conversor(double valueInput, String medidaConvertir) {
    this.valueInput = valueInput;
    this.medidaConvertir = medidaConvertir;

    mensajeSaludo();
    status();

    if (status) {
      conversion();
      resultadoConversion(this.valueConverted, this.medidaConvertida);
    } else {
      revisarInformacion();
    }

    mensajeDespedida();
  }

  public Object conversion() {
    if (this.medidaConvertir == "centimetros") {
      valueConverted = this.valueInput * this.m;
      medidaConvertida = "m";
    } else if (this.medidaConvertir == "metros") {
      valueConverted = this.valueInput * this.cm;
      medidaConvertida = "cm";
    }

    return valueConverted;

  }

  public Object status() {
    if ((this.valueInput > 0) && (this.medidaConvertir == "centimetros" || this.medidaConvertir == "metros")) {
      status = true;
      return status;
    } else {
      status = false;
      return status;
    }
  }

  public void println(Object value) {
    System.out.println(value);
  }

}