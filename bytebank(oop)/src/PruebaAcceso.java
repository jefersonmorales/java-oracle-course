public class PruebaAcceso {

  public static void main(String[] args) {
    Cuenta cuentaJefer = new Cuenta();
    cuentaJefer.depositar(300);
    cuentaJefer.retirar(200);

    System.out.println(cuentaJefer.getSaldo());
  }
  
  
}
