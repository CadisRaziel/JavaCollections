package CollectionSet.CompareAndComparator;

import CollectionSet.Seriado;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Seriado> {
    @Override
    public int compare(Seriado s1, Seriado s2) {
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
}
