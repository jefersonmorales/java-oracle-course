public class Funcionario {

  private String nombre;
  private String documento;
  private double salario;

  private int tipo;

  public Funcionario() {
    
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }
  
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getDocumento() {
    return documento;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }
  
  public double getBonificacion() {
    if(this.tipo == 0) {
      return this.salario * 0.1;
    } else if (this.tipo == 1) {
      return this.salario * 1;
    } else {
      return 0;
    }
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  
  
  
}