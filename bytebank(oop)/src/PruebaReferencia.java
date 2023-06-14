public class PruebaReferencia {
  public static void main(String[] args) {
    Cliente clienteJefer = new Cliente();

    clienteJefer.nombre = "Jeferson";
    clienteJefer.documento = "7089552";
    clienteJefer.telefono = "5555555555";

    Cuenta cuentaJefer = new Cuenta();

    cuentaJefer.setAgencia(2);
    cuentaJefer.setTitular(clienteJefer);

    System.out.println(cuentaJefer.getTitular().getDocumento()); //hacemos referencia al objeto


    System.out.println(cuentaJefer.getTitular()); //hacemos referencia al id de memoria de clienteJefer
    System.out.println(clienteJefer); //hacemos referencia al id de memoria de clienteJefer
    
    
  }
  
  
}
