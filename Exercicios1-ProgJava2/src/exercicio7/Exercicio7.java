package exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //Faça um programa que leia três valores numéricos inteiros, identifique e
        //apresente o menor valor informado.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int number1 = Integer.parseInt(leitor.nextLine());

        System.out.print("Valor 2: ");
        int number2 = Integer.parseInt(leitor.nextLine());

        System.out.print("Valor 3: ");
        int number3 = Integer.parseInt(leitor.nextLine());

        int[] valores = {number1, number2, number3};

        int lowerNumber = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < lowerNumber) {
                lowerNumber = valores[i];
            } else if (lowerNumber == 0) {
                lowerNumber = valores[i];
            }
        }

        System.out.println("O menor valor é: "+ lowerNumber);
    }
}
