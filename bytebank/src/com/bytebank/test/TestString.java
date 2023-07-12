package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

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
		
		CuentaAhorros cuentatest = new CuentaAhorros(100);
		
		printLine(nombre);
		printLine(letra);
		printLine(index);
		printLine(cuentatest);
		printLine(new CuentaAhorros(500));
	}
	
	public static void printLine(Object value) {
		System.out.println(value.toString());
	}
	
	/**
	 * Esto es una sobre carga, ya que debimos crear un printLine por cada tipo de dato y soporte nombre, letra e index.
	 */
//	public static void printLine(String value) {
//		System.out.println(value);
//	}
//	public static void printLine(char value) {
//		System.out.println(value);
//	}
//	public static void printLine(int value) {
//		System.out.println(value);
//	}
	
	/**
	 * Para evitar lo anterior podemos usar Object ya que todo en java es un objeto y es la clase padre. Con este tipo, soportaria todo tipo de dato
	 * @param value
	 */

}
