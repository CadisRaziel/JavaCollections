package CollectionList.Exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicios {
    /*
    Primeiro:
    • Faça um programa que receba a temperatura media dos 6 primeiros meses do ano e armazene-as em uma lista
    • Apos isto, calcule a média semestral das temperaturas e mostre todas as temperatuas acima desta média,
    e em que mes elas ocorreram (mostrar o mês por extenso: 1 - janeiro, 2 - fevereiro etc..)
*/

    public static void main(String[] args) {

        /*
        List<Temperatura> temp = new ArrayList<>() {{
            add(new Temperatura(21d, "Janeiro"));
            add(new Temperatura(22d, "fevereiro"));
            add(new Temperatura(23d, "março"));
            add(new Temperatura(24d, "abril"));
            add(new Temperatura(25d, "maio"));
            add(new Temperatura(26d, "junho"));
        }};

        double sum = 0;
        for (Temperatura t : temp) {
            sum += t.getGraus();
            double result = sum/temp.size();
            if(result <= 23.5) {
                System.out.println(t.getMeses());
            }
        }


        //média semestral
        System.out.println(sum/temp.size());

        double result = sum/temp.size();
        System.out.println(result);
*/

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList();
        double soma = 0.0;

        for(int i = 1; i <= 6; ++i) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturasSemenstral = soma / (double)temperaturasSemestral.size();
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
        System.out.println("----------");
        Iterator var7 = temperaturasSemestral.iterator();

        while(var7.hasNext()) {
            Double temp = (Double)var7.next();
            if (temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println(index + 1 + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println(index + 1 + " - FEVEREIRO: " + temp + " oC");
                        break;
                    case 2:
                        System.out.println(index + 1 + " - MARÇO: " + temp + " oC");
                        break;
                    case 3:
                        System.out.println(index + 1 + " - ABRIL: " + temp + " oC");
                        break;
                    case 4:
                        System.out.println(index + 1 + " - MAIO: " + temp + " oC");
                        break;
                    case 5:
                        System.out.println(index + 1 + " - JUNHO: " + temp + " oC");
                }
            }
        }
    }
}
