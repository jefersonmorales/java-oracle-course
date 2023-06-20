public class Flujo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }
  
  public static void metodo1(){
    System.out.println("Ini do metodo1");

    try {
      metodo2();
    } catch (MiException me) {
      me.printStackTrace();
    }
    
    System.out.println("Fim do metodo1");
  }

  public static void metodo2(){
    System.out.println("Ini do metodo2");
    throw new MiException("Mi excepcion fue lanzada"); 
  }
  
}
