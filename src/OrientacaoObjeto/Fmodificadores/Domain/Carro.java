package OrientacaoObjeto.Fmodificadores.Domain;

public class Carro {
    private String nome;
    private double velocidademaxima;
    public static double velocidadeLimite = 250;


    public Carro(String nome, double velocidademaxima) {
        this.nome = nome;
        this.velocidademaxima = velocidademaxima;
    }

    public void imprime(){
        System.out.println("------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidademaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }


}
