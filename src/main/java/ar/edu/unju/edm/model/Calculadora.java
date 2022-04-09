package ar.edu.unju.edm.model;

@Component

public class Calculadora {

  private int numero1;
  private int numero2;

  public Calculadora() {

  }

  public int getNumero1() {
      return numero1;
  }

  public void setNumero1(int numero1) {
      this.numero1 = numero1;
  }

  public int getNumero2() {
      return numero2;
  }

  public void setNumero2(int numero2) {
      this.numero2 = numero2;
  }

  public int ResolverSuma() {
      int resultado = numero1 + numero2;
      return resultado;
  }

  public int ResolverResta() {
      int resultador = numero1 - numero2;
      return resultador;
  }

  public int ResolverMulti() {
      int resultadom = numero1 * numero2;
      return resultadom;
  }

  public int ResolverDivision() {

      if (numero2 != 0) {
          int resultadod = numero1 / numero2;
          return resultadod;
      } else {
          System.out.println("El Segundo numero ingresado tiene que ser distinto de CERO");
          return 0;
      }

  }

  public int ResolverPotencia() {
      int resultadop = calculatePower(numero1, numero2);
      return resultadop;
  }

  static int calculatePower(int num, int power) {
      int answer = 1;
      if (num > 0 && power == 0) {
          return answer;
      } else if (num == 0 && power >= 1) {
          return 0;
      } else {
          for (int i = 1; i <= power; i++) {
              answer = answer * num;
          }
          return answer;
      }
  }

  public float ResolverRaiz() {
      double resultadora = Math.pow((double) this.numero1, (double) 1 / this.numero2);
      return (float) resultadora;
  }

}