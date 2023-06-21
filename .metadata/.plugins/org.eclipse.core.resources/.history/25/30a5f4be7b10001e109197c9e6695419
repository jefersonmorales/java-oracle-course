public class TestCuenta {

  public static void main(String[] args) {
    
    CuentaCorriente cc = new CuentaCorriente(1);
    CuentaAhorros ca = new CuentaAhorros(2);

    cc.depositar(100);
    try {
      cc.transfiere(80, ca);
    } catch (SaldoInsuficienteException e) {
      e.printStackTrace();
    }

    System.out.println(cc.getSaldo());
    System.out.println(ca.getSaldo());
    
  }
}
