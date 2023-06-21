package modelo;

public abstract class Cuenta { 
  
  protected double saldo; // Lo cambiamos a protected para que pueda ser usado en otras clases
  private int agencia;
  int numero;
  private Cliente titular = new Cliente();

  private static int total=0;



  public Cuenta(int agencia) {
    if(agencia <= 0) {
      this.agencia = 1;
    } else {
      this.agencia = agencia;
    }

    total++;
    System.out.println("Se van creando "+total+" cuentas");
    
  }

  public abstract void depositar(double valor);

  public void retirar(double valor) throws SaldoInsuficienteException{
    if(this.saldo < valor) {
      throw new SaldoInsuficienteException("Su saldo no es suficiente");
    }

    this.saldo = this.saldo - valor;
  }

  public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException{
    if(this.saldo >= valor) {
        this.retirar(valor);
        destino.depositar(valor);
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
  
  public static int getTotal() {
    return Cuenta.total;
  }
  
}