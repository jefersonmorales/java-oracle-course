public class PruebaReferencia3 {

  public static void main(String[] args) {
    
    Cuenta cuentaJefer = new Cuenta();
    Cliente clienteJefer = new Cliente();
    

    cuentaJefer.setTitular(clienteJefer); // esto es una inicializacion
    clienteJefer.setNombre("jeferson morales");
    
    System.out.println(cuentaJefer.getTitular().getNombre());
  }
}
