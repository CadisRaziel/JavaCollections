package CollectionsStream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


        System.out.println("Imprima todos os elementos dessa lista de String");
        //o foreach aqui ta usando um consumer então eu posso utilizar o reference Method que é quase a mesma coisa do lambda
        //com reference method
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("");

        //com lambda
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        System.out.println("");

        //posso retirar o stream
        numerosAleatorios.forEach(s -> System.out.println(s));
        numerosAleatorios.forEach(System.out::println);


        System.out.println("");

        System.out.println("Pegue os 5 ultimos primeiros e coloque dentro de um set");
        //collect -> pegue algo de um lugar e coloque em outro lugar
        //limit -> do 0 ao 4 (colocamos 5 ali)
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //colocando em uma variavel
        Set<String> collectionSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());


        System.out.println("");

        System.out.println("Transforme essa lista de String em uma lista de numeros inteiros");
        //lambda
        numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

        System.out.println("");

        //reference method
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //colocando numa variavel
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("");


        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        //reference method
        //como a ide me da
        List<Integer> listParesMaioiresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }).collect(Collectors.toList());
        System.out.println(listParesMaioiresQue2);

        System.out.println("");


        //usando lambda
        List<Integer> listParesMaioiresQue3 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioiresQue3);


        System.out.println("");

        System.out.println("Mostre a media dos numeros");
        //avarage -> evita numero nulo
        //forma que a ide me da
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(new DoubleConsumer() {
                    //se nao der certo ele nao da erro e nao retorna nada
                    @Override
                    public void accept(double value) {
                        System.out.println(value);
                    }
                });


        System.out.println("");

        //avarage -> evita numero nulo
        //reference method
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(System.out::println);


        System.out.println("");

        System.out.println("Remova os valores impares");
        //como a ide me da
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        System.out.println(numerosAleatoriosInteger);


        System.out.println("");

        //usando lambda
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);




    }
}
