package com.bytebank.modelo;

public class CuentaAhorros extends Cuenta{

	  public CuentaAhorros(int agencia) {
	    super(agencia);
	  }

	  @Override
	  public void depositar(double valor) {
	    this.saldo = this.saldo + valor;
	  }
	  
	  @Override
	public String toString() {
		return super.toString();
	}
	  
	  
	}
