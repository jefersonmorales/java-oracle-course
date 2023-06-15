public class Administrador extends Funcionario implements Autenticable {

  @Override
  public boolean iniciarSesion(String clave) {
    return false;
  }

  @Override
  public void setClave(String clave) {
  }

  @Override
  public double getBonificacion() {
    return 0;
  }
  
}