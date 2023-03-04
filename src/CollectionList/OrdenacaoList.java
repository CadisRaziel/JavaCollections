package CollectionList;

import CollectionList.ComparableAndComparator.ComparatorCor;
import CollectionList.ComparableAndComparator.ComparatorIdade;
import CollectionList.ComparableAndComparator.ComparatorNomeCorIdade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    /*
    Dada as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo
    (nome - idade - cor)

    exemplo:
    Gato 1 = nome: Jon, idade: 18, cor: preto,
    Gato 2 = nome: Simba, idade: 10, cor: branco,
    Gato 3 = nome: Pateta, idade: 12, cor: cinza,
     */

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato( "Jon",  18, "amarelo"));
            add(new Gato( "Simba",  10, "tigrado"));
            add(new Gato( "Pateta",  12, "preto"));
        }};

        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(meusGatos);
        System.out.println("\n");


        System.out.println("--\tOrdem aleatoria\t--");
        //shuffle -> ordem aleatoria
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("\n");


        System.out.println("--\tOrdem natural\t--");
        //para isso precisamos por o comparable na classe gato
        //lembrando ele vai comparar por ordem alfabetica
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("\n");


        System.out.println("--\tOrdem idade\t--");
        //precisamos usar o comparator (criei uma classe a parte pois a gato ja tinha o comparable
        //poderia ter feito isso com a ordem natural
        Collections.sort(meusGatos, new ComparatorIdade());
        //posso fazer tanto da forma de cima /\ quando da debaixo \/
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("\n");



        System.out.println("--\tOrdem cor\t--");
        //lembrando ele vai comparar por ordem alfabetica
        Collections.sort(meusGatos, new ComparatorCor());
        //posso fazer tanto da forma de cima /\ quando da debaixo \/
        //meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("\n");



        System.out.println("--\tOrdem nome/Cor/Idade\t--");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        //posso fazer tanto da forma de cima /\ quando da debaixo \/
        //meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        System.out.println("\n");

    }
}

