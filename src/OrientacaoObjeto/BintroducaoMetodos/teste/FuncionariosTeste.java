package OrientacaoObjeto.BintroducaoMetodos.teste;

import OrientacaoObjeto.BintroducaoMetodos.dominio.Funcionarios;

import java.util.Scanner;

public class FuncionariosTeste {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios();
        Funcionarios funcionario2 = new Funcionarios();

        funcionario1.setNome("Jose");
        funcionario1.setIdade(21);


        funcionario2.setNome("joaquim");
        funcionario2.setIdade(22);

        int resposta[] = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 4; i++ ){
            System.out.println("Digite o "+ i +" salario do " + funcionario1.getNome());
            resposta[i] = scanner.nextInt();
        }
        funcionario1.imprimirDados();
        funcionario1.mediaSalarial(resposta);

        for (int i = 1; i <4; i++ ){
            System.out.println("Digite o "+ i +" salario do " + funcionario2.getNome());
            resposta[i] = scanner.nextInt();
        }
        funcionario2.imprimirDados();
        funcionario2.mediaSalarial(resposta);

    }
}
