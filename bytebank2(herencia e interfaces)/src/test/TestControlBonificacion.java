package test;

import modelo.Funcionario;
import modelo.Contador;
import modelo.Gerente;
import modelo.ControlBonificacion;

public class TestControlBonificacion {

  public static void main(String[] args) {
    Funcionario Jefer = new Contador();
    Jefer.setSalario(100);

    Gerente Valeria = new Gerente();
    Valeria.setSalario(100);

    Contador miguel = new Contador();
    miguel.setSalario(100);  

    ControlBonificacion controlBonificacion = new ControlBonificacion();

    controlBonificacion.registrarSalario(Jefer);
    controlBonificacion.registrarSalario(Valeria);
    controlBonificacion.registrarSalario(miguel);
  }
}
