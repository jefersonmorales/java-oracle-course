public class Flujo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }
  
  public static void metodo1(){
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  public static void metodo2(){
    System.out.println("Ini do metodo2");
  
    for(int i =1; i<= 5; i++){
      System.out.println(i);

      try {

        if (i == 3) {
          int num = 0;
          int resultado = 20 / num; // Esto es un error porque cualquier numero dividido entre 0 es un error.
          System.out.println(resultado);
        }

        String test = null;
        System.out.println(test.toString());

        // Podemos capturar diferentes errores, haciendo diferentes catch

        // | Nos sirve para integrar diferentes errores
      } catch(ArithmeticException | NullPointerException exception) { // Esto permite capturar el error
        System.out.println("Atrapo error: " + exception.getMessage()); // nos retorna el mensaje
        exception.printStackTrace(); // nos retorna la direccion de error
      } 

    }
    
    System.out.println("Fim do metodo2");
  
  }
  
}
