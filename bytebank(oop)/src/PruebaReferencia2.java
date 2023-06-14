public class PruebaReferencia2 {
  public static void main(String[] args) {
    Cuenta cuentaJefer = new Cuenta();
    Cliente clienteJefer = new Cliente();

    cuentaJefer.setTitular(clienteJefer);

    // Exception Error = aparece cuando no hemos hecho la referencia correctamente 
    
    System.out.println(cuentaJefer.getTitular().getNombre()); // En este caso daria null porque si estamos haciendo la referencia, pero no hemos asignado ningun valor a nombre de la clase cliente. Ademas en la linea 8 si hestamos llamando correctamente. 

    // Si eliminamos la linea 6 entonces nos daria un exception error porque en la linea 10 estamos haciendo referencia a un atributo de una clase que no hemos indicado
    
  }
}
