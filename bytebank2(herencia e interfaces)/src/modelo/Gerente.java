package modelo;

public class Gerente extends Funcionario implements Autenticable{

  private AutenticacionUtil util;

  public Gerente() {
    this.util = new AutenticacionUtil();
  }
  
  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE GERENTE");
    return 0;
  }

  @Override
  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }

  @Override
  public void setClave(String clave) {
    this.setClave(clave);
  }
}
