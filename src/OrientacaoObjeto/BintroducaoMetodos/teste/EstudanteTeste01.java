package OrientacaoObjeto.BintroducaoMetodos.teste;


import OrientacaoObjeto.BintroducaoMetodos.dominio.Estudante;
import OrientacaoObjeto.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Alisson";
        estudante01.idade = 29;
        estudante01.sexo = "Masculino";

        estudante02.nome = "Joice";
        estudante02.idade = 32;
        estudante02.sexo = "Feminino";

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}