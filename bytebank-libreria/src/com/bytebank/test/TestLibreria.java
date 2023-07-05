package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

public class TestLibreria {
	
	public static void main(String[] args) {
		Cuenta jeferson = new CuentaAhorros(20);
		
		jeferson.depositar(300);
		
		System.out.println(jeferson.getSaldo());
	}

}
