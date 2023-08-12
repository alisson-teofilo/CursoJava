package OrientacaoObjeto.Fmodificadores.Domain;



public class TesteJson {
    private String[] vetorJson;

    public String[] getVetorJson() {
        return vetorJson;
    }

    public void setVetorJson(String[] vetorJson) {
        this.vetorJson = vetorJson;
    }

    public TesteJson(String[] vetorJson) {
        this.vetorJson = vetorJson;
    }

    public void imprime() {
        for (String item : this.vetorJson) {
            System.out.println(item);
        }
    }


}
