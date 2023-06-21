package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestSistemaInterno {

	public static void main(String[] args) {
	    SistemaInterno sistema = new SistemaInterno();
	    Gerente gerente1 = new Gerente();
	    Administrador admin = new Administrador();

	    gerente1.setClave("12345");

	    sistema.autenticar(gerente1);
	    sistema.autenticar(admin);
	    
	}
}