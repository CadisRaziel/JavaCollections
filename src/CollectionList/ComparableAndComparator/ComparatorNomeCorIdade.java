package CollectionList.ComparableAndComparator;

import CollectionList.Gato;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        //se os nomes forem iguais o criterio de desempate é a cor, se a cor for igual o criterio de desempate é a idade
        //resumindo, o que for diferente primeiro ele vai ordenar natualmente
        //primeiro vamos comparar os nomes, se for igual, pulamos pra cor se for igual pulamos pra idade
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0){
            //se o nome for 1 ou -1 ele vai ordenar pelo nome
            return nome;
        }

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if(cor != 0) {
            return cor;
        }

        return Integer.compare(o1.getIdade(), o2.getIdade());

    }
}
