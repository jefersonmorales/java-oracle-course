public class TestConexion {

  public static void main(String[] args) throws Exception {
    
    /* 
    try (Conexion conexion = new Conexion()) {
      conexion.leerDatos();
    } catch (IllegalStateException e) {
      System.out.println("Ejecutando catch");
      e.printStackTrace();
    }*/

    Conexion conexion = null;
    
    try {
      conexion = new Conexion();
      conexion.leerDatos();
    } catch (IllegalStateException ex) {
      ex.printStackTrace();
    } finally {
      System.out.println("Ejecutando finally");
      if (conexion != null) {
        conexion.cerrar();
      }
    }
    
  }
  
}
