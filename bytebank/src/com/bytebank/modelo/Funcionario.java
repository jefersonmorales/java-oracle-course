package com.bytebank.modelo;

public abstract class Funcionario {

	  // abstract nos sirve para hacer que la clase Funcionario no pueda ser instanciada. O sea, nadie puede ser funcionario. Deben ser contador o gerente,etc

	  private String nombre;
	  private String documento;
	  private double salario;

	  public Funcionario() {
	    
	  }
	  
	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }

	  public String getNombre() {
	    return nombre;
	  }
	  
	  public void setDocumento(String documento) {
	    this.documento = documento;
	  }

	  public String getDocumento() {
	    return documento;
	  }

	  public void setSalario(double salario) {
	    this.salario = salario;
	  }

	  public double getSalario() {
	    return salario;
	  }

	  public abstract double getBonificacion(); // estamos obligando a que las otras clases sobreescriban este metodo con un cuerpo
	}