package OrientacaoObjeto.Fmodificadores.Teste;

import OrientacaoObjeto.Fmodificadores.Domain.TesteJson;

public class TesteJsonMain {
    public static void main(String[] args) {
        TesteJson arrayString = new TesteJson(new String[] {"argumento1", "argumento2", "argumento3"});
         arrayString.imprime();
    }

}
