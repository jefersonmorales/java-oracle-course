public class PruebaMetodos {

  public static void main(String[] args) {
    Cuenta miCuenta = new Cuenta();
    miCuenta.depositar(500);
    miCuenta.depositar(200);

    System.out.println(miCuenta.getSaldo());


    miCuenta.retirar(300);
    System.out.println(miCuenta.getSaldo());
    
  }
  
}
