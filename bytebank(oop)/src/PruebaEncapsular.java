public class PruebaEncapsular {

  public static void main(String[] args) {

    Cliente pruebCliente = new Cliente();

    pruebCliente.setNombre("Carlos");
    pruebCliente.setDocumento("70495235");
    pruebCliente.setTelefono("5555 5555");

    System.out.println(pruebCliente.getNombre());
    
  }  
  
  
}
