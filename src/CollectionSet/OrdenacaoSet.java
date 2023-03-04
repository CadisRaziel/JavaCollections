package CollectionSet;


import CollectionList.ComparableAndComparator.ComparatorNomeCorIdade;
import CollectionSet.CompareAndComparator.ComparatoNomeGeneroTempoEpisodio;
import CollectionSet.CompareAndComparator.ComparatorGenero;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatoria\t--");
        Set<Seriado> minhasSeries = new HashSet<>() {{
            add(new Seriado("got", "fantasia", 60));
            add(new Seriado("Dark", "drama", 60));
            add(new Seriado("sons", "acao", 25));
        }};
        for (Seriado seriado : minhasSeries) {
            System.out.println(seriado.getNome()
                    + " - " +
                    seriado.getGenero()
                    + " - " +
                    seriado.getTempoEpisodio());
        }

        System.out.println("");

        System.out.println("--\tOrdem Inserção\t--");
        //aqui eu utilizo o LinkedHashSet
        Set<Seriado> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Seriado("got", "fantasia", 60));
            add(new Seriado("Dark", "drama", 60));
            add(new Seriado("sons", "acao", 25));
        }};
        for (Seriado seriado1 : minhasSeries1) {
            System.out.println(seriado1.getNome()
                    + " - " +
                    seriado1.getGenero()
                    + " - " +
                    seriado1.getTempoEpisodio());
        }

        System.out.println("");


        System.out.println("--\tOrdem Natural(tempoEpisodio)\t--");
        //aqui eu utilizo o treeSet
        //preciso fazer o comparable na classe Serie e verificar a função para ter criterio de desempate
        Set<Seriado> minhasSeries2 = new TreeSet<>() {{
            add(new Seriado("got", "fantasia", 60));
            add(new Seriado("Dark", "drama", 60));
            add(new Seriado("sons", "acao", 25));
        }};
        for (Seriado seriado2 : minhasSeries2) {
            System.out.println(seriado2.getNome()
                    + " - " +
                    seriado2.getGenero()
                    + " - " +
                    seriado2.getTempoEpisodio());
        }

        System.out.println("");

        System.out.println("--\tOrdem nome/Genero/TempoEpisodio\t--");
        Set<Seriado> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Seriado seriado3 : minhasSeries3) {
            System.out.println(seriado3.getNome()
                    + " - " +
                    seriado3.getGenero()
                    + " - " +
                    seriado3.getTempoEpisodio());
        }

        System.out.println("");


        System.out.println("--\tOrdem generot\t--");
        //Collections.sort(minhasSeries, new ComparatorGenero());
        System.out.println("--\tOrdem Tempo Episodio\t--");


    }
}