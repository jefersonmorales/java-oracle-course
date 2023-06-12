// entidad Cuenta:
class Cuenta { 
  double saldo;
  int agencia;
  int numero;
  String titular;

  // void depositar(double valor) {
  //   saldo = saldo + valor;
  // }

  void depositar(double valor) {
    // this es una practica usada para hacer referencia al atributo que esta en el objeto
    
    this.saldo = this.saldo + valor;
  }
  
}