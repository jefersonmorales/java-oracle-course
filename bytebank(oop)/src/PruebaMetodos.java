public class PruebaMetodos {

  public static void main(String[] args) {
    Cuenta miCuenta = new Cuenta();
    miCuenta.saldo = 500;
    miCuenta.depositar(200);

    System.out.println(miCuenta.saldo);


    miCuenta.retirar(300);
    System.out.println(miCuenta.saldo);
    
  }
  
}
