package CollectionSet;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        //LEMBRE-SE O SET NAO REPETE ELEMENTOS
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0");
        //nao conseguimos fazer busca por posição no set

        System.out.println("Adicione na lista uma nota 8.0 na posição 4");
        //nao conseguimos fazer inserção por posição no set

        System.out.println("Subistitua a nota 5.0 pela nota 6.0");
        //nao temos como fazer isso pois as posições estão aleatorias

        System.out.println("Confira se a nota 5.0 está no conjunto");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada");
        //não conseguimos fazer pesquisa por posição

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.printf("%.2f\n", soma);


        System.out.println("Exiba a media das notas");
        System.out.printf("%.2f\n", soma / notas.size());

        System.out.println("Remova a nota 0");
        notas.remove(0.0);

        System.out.println("Remova a nota da posição 0");
        //não conseguimos remover por posição


        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        //preciso usar o LinkedHashSet para isso
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //posso fazer caso queira 'nota1.add(7d); etc...
        System.out.println(notas1);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        //preciso usar o TreeSet para isso (organiza com a ordem natual dos elementos)
        Set<Double> notas2 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        //System.out.println("Apague todo o conjunto");
        //notas.clear();


        System.out.println("Confira se o conjunto esta vazio: ");
        System.out.println(notas.isEmpty());

    }
}
