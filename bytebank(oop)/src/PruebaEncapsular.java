public class PruebaEncapsular {

  public static void main(String[] args) {

    Cuenta pruebCuenta = new Cuenta();
    Cliente pruebCliente = new Cliente();

    pruebCuenta.setTitular(pruebCliente);

    pruebCliente.setNombre("Carlos");
    pruebCliente.setDocumento("70495235");
    pruebCliente.setTelefono("5555 5555");

    // System.out.println(pruebCliente.getNombre());
    System.out.println(pruebCuenta.getTitular().getDocumento());
    
  }  
  
  
}
