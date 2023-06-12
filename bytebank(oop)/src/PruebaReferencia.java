public class PruebaReferencia {
  public static void main(String[] args) {
    Cliente jefer = new Cliente();

    jefer.nombre = "Jeferson";
    jefer.documento = "7089552";
    jefer.telefono = "5555555555";

    Cuenta cuentaJefer = new Cuenta();

    cuentaJefer.agencia = 2;
    cuentaJefer.titular = jefer;

    System.out.println(cuentaJefer.titular.documento); //hacemos referencia al objeto


    System.out.println(cuentaJefer.titular); //hacemos referencia al id de memoria de jefer
    System.out.println(jefer); //hacemos referencia al id de memoria de jefer
    
    
  }
  
  
}
