public class Flujo {

  public static void main(String[] args) throws MiException {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }
  
  public static void metodo1() throws MiException{
    System.out.println("Ini do metodo1");
      metodo2();
    
    System.out.println("Fim do metodo1");
  }

  public static void metodo2() throws MiException {
    System.out.println("Ini do metodo2");
    throw new MiException("Mi excepcion fue lanzada"); 
  }

  

  // En este caso estamos extendiendo directamente a Exception y es para asegurar que va a lanzar una excepcion, mientras que extendiendo con RuntimeException es indicar que puede ser posible que lance una excepcion. 

  // si no queremos usar el metodo de try y catch() debemos indicar nuestra excepcion en cada uno con throws
  
}
