package CollectionMap.ComparableAndComparator;

import CollectionMap.Livro;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    //<Map.Entry<String, Livro>> passei esse tipo aqui pro comparator pois la na classe o tipo é esse
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
