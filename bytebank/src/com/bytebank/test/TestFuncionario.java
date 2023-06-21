package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();

		funcionario.setNombre("Jeferson Morales");
		funcionario.setDocumento("31334350");
		funcionario.setSalario(200);
		
		System.out.println(funcionario.getNombre());
		System.out.println(funcionario.getBonificacion());

	}
  
}