package exercicio6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Desenvolva um programa que leia três valores numéricos inteiros,
        //identifique e apresente o maior valor informado.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int number1 = Integer.parseInt(leitor.nextLine());

        System.out.print("Valor 2: ");
        int number2 = Integer.parseInt(leitor.nextLine());

        System.out.print("Valor 3: ");
        int number3 = Integer.parseInt(leitor.nextLine());

        int[] valores = {number1, number2, number3};

         int majorNumber = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > majorNumber) {
                majorNumber = valores[i];
            }
        }

        System.out.println("O valor mais alto é: "+ majorNumber);

    }
}
