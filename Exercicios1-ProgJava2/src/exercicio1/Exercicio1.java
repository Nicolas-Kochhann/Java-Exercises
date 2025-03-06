package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       //Faça um programa que leia dois valores numéricos inteiros e apresente
        //o resultado da diferença do maior valor pelo menor valor. Se os valores
        //forem iguais, o programa deve mostrar zero.

        Scanner leitor = new Scanner(System.in);

        System.out.print("valor 1: ");
        int numberA = Integer.parseInt(leitor.nextLine());

        System.out.print("valor 2: ");
        int numberB = Integer.parseInt(leitor.nextLine());

        int finalNumber = 0;

        if (numberA < numberB){
            finalNumber = numberB - numberA;
        } else if (numberB < numberA) {
            finalNumber = numberA - numberB;
        }

        System.out.print("result: "+ finalNumber);

    }
}
