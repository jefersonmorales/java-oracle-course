public class PruebaFuncionario {

  public static void main(String[] args) {
    Funcionario jefer = new Funcionario();

    jefer.setNombre("Jeferson Morales");
    jefer.setDocumento("31334350");
    jefer.setSalario(555.52);

    System.out.println("Nombre: "+jefer.getNombre()+" -------------------"+" Documento: " + jefer.getDocumento() + "-----------------------------------" + " Salario: " + jefer.getSalario());

    
  }
  
}
