package OrientacaoObjeto.CsobrecarcaMetodos.Teste;

import OrientacaoObjeto.CsobrecarcaMetodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Alisson", "manga", 10);
        anime.init("Vitoria", "Manga", 28, "Romance");

        anime.imprime();
    }
}
