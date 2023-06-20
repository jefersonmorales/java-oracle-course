public class TestingException {

  public static void main(String[] args) {
    Cuenta ca = new CuentaAhorros(300);
    ca.depositar(300);
    ca.retirar(310);

    System.out.println(ca.getSaldo());
  }
  
  
}
