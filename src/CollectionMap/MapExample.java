package CollectionMap;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        /*
        * Map carrosPopulares = new HashMap(); //antes do java5
        * Map<String, Double> carrosPopulares = new HashMap<>();
        * HashMap<String, Double> carrosPopulares = Map.of("carro1", 14.4, "carro2, 15.6);
        * */


        System.out.println("Crie um dicionario que relacioine os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gold por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno");
        System.out.println(carrosPopulares.get("uno"));

        System.out.println("Exiba o terceiro modelo adicionado");
        //como é aleatorio, nao tem como fazer isso

        System.out.println("Exiba os modelos");
        System.out.println(carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros");
        System.out.println(carrosPopulares.values());

        System.out.println("Exiba o modelo mais economico e o seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e o seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }


        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);


        System.out.println("Exiba a media dos consumos deste map de carros");
        System.out.println(soma/carrosPopulares.size());


        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);


        System.out.println("Exiba todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);


        System.out.println("Exiba o map ordenado pelo modelo (ordem alfabetica)");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);


        System.out.println("Apague o map de carros");
        carrosPopulares.clear();

        System.out.println("Confira se a lista esta vazia");
        System.out.println(carrosPopulares.isEmpty());
    }
}
