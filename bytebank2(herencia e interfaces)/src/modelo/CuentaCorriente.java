package modelo;

public class CuentaCorriente extends Cuenta {


// para poder tener acceso a una cuenta debemos tener una agencia. En este caso estamos haciendo referencia al constructor de cuenta para que siga la misma regla.
  public CuentaCorriente(int agencia) {
    super(agencia);
  }

  @Override
  public void retirar(double valor) throws SaldoInsuficienteException{
    double comision = 2;
    super.retirar(valor+comision);
  }

  @Override
  public void depositar(double valor) {
    
  }
  
}
