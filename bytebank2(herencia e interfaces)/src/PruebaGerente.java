public class PruebaGerente {

  public static void main(String[] args) {
    Funcionario gerente = new Funcionario();

    gerente.setSalario(600);
    gerente.setTipo(1);
    
    System.out.println(gerente.getBonificacion());
    System.out.println("su sueldo es: "+ (gerente.getSalario() + gerente.getBonificacion()));
    
  }
  
  
}
