package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Construa um programa que leia três valores para os lados de um
        //triângulo (A, B e C). O programa deve verificar se os lados fornecidos
        //formam realmente um triângulo. Em caso positivo, deve mostrar a
        //mensagem “Os lados formam um triângulo” e caso contrário “Os valores
        //informados não podem formar um triângulo”. Para que três valores de
        //lados formem um triângulo, cada par de lados somados não pode ser
        //menor ou igual ao terceiro lado.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double lado1 = Double.parseDouble(leitor.nextLine());

        System.out.print("Lado 2: ");
        double lado2 = Double.parseDouble(leitor.nextLine());

        System.out.print("Lado 3: ");
        double lado3 = Double.parseDouble(leitor.nextLine());

        if ((lado1 + lado2) >= lado3 & (lado2 + lado3) >= lado1 & (lado1 + lado3) >= lado2) {
            System.out.println("Os lados formam um triângulo");
        } else {
            System.out.println("Os valores informados não podem formar um triângulo");
        }
    }
}
