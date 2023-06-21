package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestingException {

	  public static void main(String[] args) {
	    Cuenta ca = new CuentaAhorros(300);
	    ca.depositar(300);
	    try {
	      ca.retirar(310);
	    } catch (SaldoInsuficienteException e) {
	      e.printStackTrace();
	    }

	    System.out.println(ca.getSaldo());
	  }
	  
	  
	}
