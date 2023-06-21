package com.bytebank.test;

// importar todo el paquete 
import com.bytebank.modelo.*;

// importar elemento por elemento
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.Contador;

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
