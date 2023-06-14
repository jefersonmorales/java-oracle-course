public class PruebaConstructor {
  
  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta(500);
    Cuenta cuenta1 = new Cuenta(200);
    Cuenta cuenta2 = new Cuenta(100);
    
    System.out.println(Cuenta.getTotal());
  }
  
  
}
