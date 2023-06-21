package test;

import modelo.Funcionario;
import modelo.Contador;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();

	    funcionario.setNombre("Jeferson Morales");
	    funcionario.setDocumento("31334350");
	    funcionario.setSalario(200);

	    // System.out.println("Nombre: "+funcionario.getNombre()+" -------------------"+" Documento: " + funcionario.getDocumento() + "-----------------------------------" + " Salario: " + funcionario.getSalario());

	    // System.out.println("Su sueldo es: "+funcionario.getSalario()+" -Bonificacion: "+funcionario.getBonificacion()+" -Total: "+(funcionario.getBonificacion()+funcionario.getSalario()));
	    
	    System.out.println(funcionario.getBonificacion());

	}
  
}
