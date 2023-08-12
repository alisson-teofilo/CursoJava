package OrientacaoObjeto.BintroducaoMetodos.teste;

import OrientacaoObjeto.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Alisson");
        pessoa.setIdade(29);

       // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());



    }
}
