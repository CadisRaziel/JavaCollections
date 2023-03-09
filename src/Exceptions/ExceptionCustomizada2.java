package Exceptions;

import Exceptions.ClasseExceptionCustomizada.DivisaoNaoExataException;

import javax.swing.*;

public class ExceptionCustomizada2 {
    // %2 != 0 -> IMPAR
    // %2 == 0 -> PAR
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisao não exata!", numerador[i], denominador[1]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}
