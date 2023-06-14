public class PruebaGerente {

  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    // Funcionario gerente = new Funcionario();

    gerente.setClave("jefer");
    
    // gerente.setSalario(600);
    // gerente.setTipo(1);
    
    System.out.println(gerente.iniciarSesion(gerente.getClave()));
    
  }
  
  
}
