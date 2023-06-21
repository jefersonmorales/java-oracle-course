package test;

import modelo.Gerente;

public class TestGerente {

  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    // Funcionario gerente = new Funcionario();

    gerente.setClave("jefer");
    
    gerente.setSalario(600);
    // gerente.setTipo(1);
    
    System.out.println(gerente.getBonificacion());
    
  }
  
  
}
