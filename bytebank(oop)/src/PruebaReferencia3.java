public class PruebaReferencia3 {

  public static void main(String[] args) {
    
    Cuenta cuentaJefer = new Cuenta();

    cuentaJefer.titular = new Cliente(); // esto es una inicializacion
    cuentaJefer.titular.nombre = "Jeferson";


    System.out.println(cuentaJefer.titular.nombre);
    
    
  }
  
  
}
