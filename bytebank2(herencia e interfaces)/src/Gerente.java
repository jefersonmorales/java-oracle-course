public class Gerente extends Funcionario{
  
  private String clave;
  
  public void setClave(String clave) {
    this.clave = clave;
  }

  public String getClave() {
    return clave;
  }

  public boolean iniciarSesion(String clave) {
    return clave == "AluraCurso";
  }

  public double getBonificacion() {
    System.out.println("EJECUTANDO DESDE GERENTE");
    return super.getSalario()*1;
  }
}
