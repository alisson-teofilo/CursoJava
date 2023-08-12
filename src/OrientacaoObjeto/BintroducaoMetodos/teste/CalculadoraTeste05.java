package OrientacaoObjeto.BintroducaoMetodos.teste;

import OrientacaoObjeto.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = { 1, 2, 3, 4, 5};

        calculadora.somaArray(numeros);
        calculadora.varArgs(1,2,3,4,5);
    }
}

