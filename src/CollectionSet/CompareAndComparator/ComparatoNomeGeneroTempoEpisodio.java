package CollectionSet.CompareAndComparator;

import CollectionSet.Seriado;

import java.util.Comparator;

public class ComparatoNomeGeneroTempoEpisodio implements Comparator<Seriado> {
    @Override
    public int compare(Seriado s1, Seriado s2) {
        //caso exista tempo igual
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) {
            return nome;
        }

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) {
            return genero;
        }

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
