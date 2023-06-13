public class PruebaReferencia {
  public static void main(String[] args) {
    Cliente clienteJefer = new Cliente();

    clienteJefer.nombre = "Jeferson";
    clienteJefer.documento = "7089552";
    clienteJefer.telefono = "5555555555";

    Cuenta cuentaJefer = new Cuenta();

    cuentaJefer.agencia = 2;
    cuentaJefer.titular = clienteJefer;

    System.out.println(cuentaJefer.titular.documento); //hacemos referencia al objeto


    System.out.println(cuentaJefer.titular); //hacemos referencia al id de memoria de clienteJefer
    System.out.println(clienteJefer); //hacemos referencia al id de memoria de clienteJefer
    
    
  }
  
  
}
