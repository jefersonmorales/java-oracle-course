public interface Autenticable {

  // en Interface todo es abstracto
  //  una interfaz no puede extender de una clase, solo de otra interfaz
  
  public void setClave(String clave);

  public boolean iniciarSesion(String clave);
}
