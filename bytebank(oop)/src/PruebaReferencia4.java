public class PruebaReferencia4 {

  public static void main(String[] args) {
    Cuenta cuentaJefer = new Cuenta();

    cuentaJefer.titular.nombre = "Jeferson";

    System.out.println(cuentaJefer.titular.nombre);
  }
  
  // Este es otro metodo de hacer referencia. En la clase Cuenta atributo Titular, estamos inicializando con new Cliente(); por lo tanto en este clase no es necesario inicializar nuevamente. Solo asignamos un valor a titular.nombre
  
  
}
