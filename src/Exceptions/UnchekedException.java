package Exceptions;

import javax.swing.*;

public class UnchekedException {
    public static void main(String[] args) {

        //Unchecked -> Não é pego pela IDE, compilando (só é pego em release)
        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador");
            String b = JOptionPane.showInputDialog("Denominador");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado" + " -> " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        "Entrada invalida, informe um numero corretamente!");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada invalida, informe um numero diferente de 0!");
            }
        } while (continueLooping);


        System.out.println("Chegou até aqui....");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
