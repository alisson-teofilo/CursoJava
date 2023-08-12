package OrientacaoObjeto.Dconstrutures;


import OrientacaoObjeto.Dconstrutures.dominio.Anime;

import java.util.Arrays;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3[] = new Anime[0];

        anime1.setNome("Alisson");
        anime1.setTipo("Manga");
        anime1.setEpisodios(9);
        anime1.setGenero("comedia");

        anime2.setNome("Vitoria");
        anime2.setTipo("Manga");
        anime2.setEpisodios(98);
        anime2.setGenero("romance");

//        anime1.imprime();
//        anime2.imprime();

        anime3 = new Anime[]{anime1, anime2};
        for (Anime anime : anime3) {
            System.out.println(anime.getNome());
            System.out.println(anime.getTipo());
            System.out.println(anime.getEpisodios());
            System.out.println(anime.getGenero());

        }

    }
}
