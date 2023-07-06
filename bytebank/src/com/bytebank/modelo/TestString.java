package com.bytebank.modelo;

public class TestString {
	
	public static void main(String[] args) {
		String nombre = "Jeferson";
	
		System.out.println("Sin cambios: " + nombre);
		
		nombre =  nombre.concat(" Morales");
		System.out.println("Nombre concatenado: " + nombre);		
		
		nombre = nombre.replace("Jeferson", "Steven");
		System.out.println("Reemplazando caracter: " + nombre);
		
		nombre = nombre.toUpperCase();
		System.out.println("Todo en mayuscula: " + nombre);
		
		nombre = nombre.toLowerCase();
		System.out.println("Todo en minuscula: " + nombre);
		
		char letra = nombre.charAt(3);
		System.out.println("Letra del indice 3: " + letra);
		
		int index = nombre.indexOf("o");
		System.out.println("Indice de la letra o: " + index);
	}

}
