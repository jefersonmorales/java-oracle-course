public class Gerente extends Funcionario implements Autenticable{

  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE GERENTE");
    return 0;
  }

  @Override
  public boolean iniciarSesion(String clave) {
    return false;
  }

  @Override
  public void setClave(String clave) {
  
  }
}
