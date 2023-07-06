package com.bytebank.modelo;

public class TestString {
	
	public static void main(String[] args) {
		String nombre = "Alura";
		
		System.out.println("Sin cambios :" + nombre);
		
		nombre =  nombre.concat(" curso");
		System.out.println("Nombre concatenado: " + nombre);		
		
		String replace = nombre.replace("A", "a");
		System.out.println(replace);
		
	}

}
