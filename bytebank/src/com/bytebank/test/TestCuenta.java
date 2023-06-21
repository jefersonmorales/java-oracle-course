package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestCuenta {

	public static void main(String[] args) {
    
		CuentaCorriente cc = new CuentaCorriente(1);
		CuentaAhorros ca = new CuentaAhorros(2);

		ca.depositar(100);
		System.out.println("Su saldo es: " + ca.getSaldo()); 
		
		cc.depositar(150);
		System.out.println("Su saldo es: " + cc.getSaldo());
		
		try {
			ca.transfiere(60, cc);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		System.out.println("Saldo actual Cuenta Ahorro: " + ca.getSaldo());
		System.out.println("Saldo actual Cuenta Corriente: " + cc.getSaldo());   

	}
}