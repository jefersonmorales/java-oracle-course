public class Flujo {

  public static void main(String[] args) {
    System.out.println("Ini do main");

    try {
      metodo1();
    } catch (Exception e) { //estamos atrapando cualquier excepcion
      e.printStackTrace();
    }
    
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
}