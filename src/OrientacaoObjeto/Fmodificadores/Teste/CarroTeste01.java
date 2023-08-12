package OrientacaoObjeto.Fmodificadores.Teste;

import OrientacaoObjeto.Fmodificadores.Domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 230);
        Carro c2 = new Carro("Mercedes", 245);
        Carro c3 = new Carro("Buggati", 430);
        Carro.velocidadeLimite = 180;
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
