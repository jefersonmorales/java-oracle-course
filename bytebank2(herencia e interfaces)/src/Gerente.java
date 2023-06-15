public class Gerente extends FuncionarioAutenticable{

  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE GERENTE");
    return 2000;
  }
}
