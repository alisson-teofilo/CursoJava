package OrientacaoObjeto.BintroducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 2) {
            return 0;
        }
        return num1 / num2;
    }

    // mesma coisa que o método anterior
    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 2)
            return 0;
        else
            return num1 / num2;
    }

    public void imprimeDoisNumeros03(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("impossivel dividir por 0");
            return;
        }
        System.out.println("opa" + num1 / num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma +=  num;
        }
        System.out.println(soma);
    }

    public void varArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma +=  num;
        }
        System.out.println(soma);
    }


}
