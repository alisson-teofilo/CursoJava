package OrientacaoObjeto.BintroducaoMetodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private int salario;

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
    public void mediaSalarial(int[] numero){
        int soma = 0;
        for (int num: numero){
            soma += num;
        }
        salario = (soma / numero.length);
        System.out.println("A media salarial é: "+ salario);
    }
// Gets end Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
