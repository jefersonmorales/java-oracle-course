// entidad Cuenta:
class Cuenta { 
  private double saldo;
  private int agencia;
  int numero;
  private Cliente titular = new Cliente();

  public Cuenta(int agencia) {
    if(agencia <= 0) {
      this.agencia = 1;
    } else {
      this.agencia = agencia;
    }
  }

  void depositar(double valor) { 
    this.saldo = this.saldo + valor;
  }

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
  
  public int getAgencia() {
    return agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }  

  public Cliente getTitular() {
    return titular;
  }
  
}