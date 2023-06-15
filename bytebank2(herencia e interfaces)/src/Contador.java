public class Contador extends Funcionario{

  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE CONTADOR");
    return super.getSalario()*0.5;
  }
  
}
