package CollectionMap;

import CollectionMap.ComparableAndComparator.ComparatorNome;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        /*
         * Dadas as seguintes informações sobre meus livros favoritos e seus autores
         * crie um dicionario e ordene este dicionario
         * exibindo (Nome autor - nome Livro);
         *
         * Autor = Hawking, stephen - Livro = nome: Uma Breve história do tempo, paginas: 256
         * Autor = Duhigg, Charles - Livro = nome: O poder do habito, paginas: 408
         * AUtor = Harari, Yuval Noah - Livro = 21 lições para o seculo 21, paginas: 432
         * */

        System.out.println("--\tOrdem aleatoria\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, stephen", new Livro("Uma Breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21", 432));
        }};
        //imprimir só minha chave(nome do autor) e o valor (só o nome do livro)
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem inserção\t--");
        //ordem de inserção utilizamos o LinkedHashMap
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, stephen", new Livro("Uma Breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21", 432));
        }};
        //imprimir só minha chave(nome do autor) e o valor (só o nome do livro)
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabetica autores\t--");
        //ordem alfabetica ou numerica usamos TreeMap
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        //imprimir só minha chave(nome do autor) e o valor (só o nome do livro)
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }



        System.out.println("--\tOrdem alfabetica nome dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }



        System.out.println("--\tOrdem numero de pagina\t--");
    }
}
