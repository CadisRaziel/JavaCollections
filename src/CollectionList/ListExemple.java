package CollectionList;


import java.util.*;


public class ListExemple {
    public static void main(String[] args) {
        //Data uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:


        //antes do java 5
        //List notas = new ArrayList<>();

        //Generics(JDK 5) - Diamond Operator (jdk 7)
        //ArrayList<Double> notas = new ArrayList<>();

        //Nao recomendado fazer dessa forma
        //ArrayList<Double> list = new ArrayList<>();


        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        //forma limitada, não posso adicionar/remover elementos dentro dessa list
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //notas.add(10d);
        //System.out.println(notas);


        //torna a lista imutavel, nao pode adicioanr nem remover elementos
        //List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //notas.add(1d);
        //notas.remove(5d);
        //System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        //d -> é double então ao inves de pasaar 7.0 posso passar 7d
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println("\n");

        System.out.println("Exiba a posição da nota 5.0");
        System.out.println(notas.indexOf(5d));
        System.out.println("\n");

        System.out.println("Adicione na lista de nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("\n");

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("\n");


        System.out.println("Confira se a nota 5.0 esta na lista: ");
        System.out.println(notas.contains(5.0));
        System.out.println("\n");



        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        System.out.println(notas);
        //ou
        for (Double nota: notas) {
            System.out.println(notas);
        }
        System.out.println("\n");

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));
        System.out.println(notas.toString());
        System.out.println("\n");


        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));
        System.out.println("\n");


        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));
        System.out.println("\n");

        System.out.println("Exiba a soma dos valores, (somando todas as notas)");
        Iterator<Double> iterator = notas.iterator();
        //hasNext -> se tiver elemento proximo (quando nao tiver proximo ele da false e encerra o while)
        //next -> proximo
        Double soma = 0d;
        while(iterator.hasNext()){

            //vo por o elemento dentro desse next
            Double next = iterator.next();

            //e vou somar com a variavel 'soma' que começa com 0
            soma += next;
            //priemrio 7.0 + soma(que é 0)
            //segundo 7.0 + 8.5
            //terceiro 15.5 + 9.3
            //e assim ate pegar todos os elementos do array
        }
        System.out.println(soma);
        System.out.println("\n");

        System.out.println("Exiba a media das notas");
        //é a soma de tudo dividido pela quantidade de elementos
        System.out.println(soma/notas.size());
        System.out.println("\n");


        System.out.println("Remova a nota 0: ");
        //se eu nao coloca o typo e o numero certo ele vai remover a 'posição' e não a nota desejada
        //se eu colocar um inteiro ele vai remover pela posição
        notas.remove(0.0);
        System.out.println("\n");

        System.out.println("Remova a nota de posiciao 0");
        //como disse acima se eu colocar um inteiro ele remove a posição(index)
        notas.remove(0);
        System.out.println("\n");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) {
                //se for menor ele remove se não ele volta pro laço
                //aqui ele ta passando elemento por elemento
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println("\n");


        /*
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("\n");
         */


        System.out.println("Confira se a lista esta vazia: ");
        System.out.println(notas.isEmpty());
        System.out.println("\n");

        //Exercicios
        /*
        * Crie uma lista chamada nota2 e coloque todos os elementos da list Arraylist nessa nova lista
        * Mostre a primeira nota da nova lista sem remove-lo
        * Mostre a primeira nota da nova lista removendo-o
        * */

        System.out.println("Criando lista nota2 com todos os elementos da lista nota");
        List<Double> notas2 = new ArrayList<Double>();
        notas2.addAll(notas);
        System.out.println(notas2);
        System.out.println("\n");


        System.out.println("Mostre a primeira nota da nova lista sem remove-lo");
        System.out.println(notas2.get(0));
        System.out.println("\n");

        System.out.println("Mostre a primeira nota da nova lista removendo-o");
        System.out.println(notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
        System.out.println("\n");
    }

}
