package exercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Desenvolva um programa que leia quatro valores numéricos inteiros e
        //mostre os valores que são divisíveis por 2 e 3.

        Scanner leitor = new Scanner(System.in);

        System.out.print("valor 1: ");
        int valor1 = Integer.parseInt(leitor.nextLine());

        System.out.print("valor 2: ");
        int valor2 = Integer.parseInt(leitor.nextLine());

        System.out.print("valor 3: ");
        int valor3 = Integer.parseInt(leitor.nextLine());

        System.out.print("valor 4: ");
        int valor4 = Integer.parseInt(leitor.nextLine());

        int[] valores = {valor1, valor2, valor3, valor4};

        for (int i = 0; i < 4; i++) {
            if (valores[i]%2 == 0 || valores[i]%3 == 0){
                System.out.print(valores[i]+" ");
            }
        }

    }
}
