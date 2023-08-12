package OrientacaoObjeto.BintroducaoMetodos.teste;

import OrientacaoObjeto.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(2, 2);
        System.out.println(result);
    }
}
