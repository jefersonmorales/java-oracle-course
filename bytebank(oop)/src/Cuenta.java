// entidad Cuenta:
class Cuenta { 
  private double saldo;
  int agencia;
  int numero;
  Cliente titular = new Cliente();

  // void depositar(double valor) {
  //   saldo = saldo + valor;
  // }

  
  // metodo no retorna valor
  void depositar(double valor) {
    // this es una practica usada para hacer referencia al atributo que esta en el objeto
    
    this.saldo = this.saldo + valor;
  }

  // metodo retorna valor
  public boolean retirar(double valor) {
    if(this.saldo >= valor) {
      this.saldo = this.saldo - valor;
      return true;
    } else {
      return false;
    }
  }

  public double getSaldo() {
    return this.saldo;

  }
  
  public void setAgencia(int nuevaAgencia) {
    if(nuevaAgencia > 0) {
      this.agencia = nuevaAgencia;
    } else {
      System.out.println("No esta permitido numeros menores a 0");
    }
  }
  
  public int getAgencia() {
    return agencia;
  }
  
}