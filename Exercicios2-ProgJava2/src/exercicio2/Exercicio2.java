package exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        //Faça um programa que calcule o somatório, a soma dos quadrados e a
        //média entre os n primeiros números inteiros positivos.

        System.out.print("Digite um número: ");
        double n = Integer.parseInt(System.console().readLine());

        int i = 0;
        double soma = 0;
        double somaQuadrados = 0;
        while (i < n){
            i++;
            soma += i;
            somaQuadrados += Math.pow(i, 2);
        }

        System.out.println("Somatório: "+soma);
        System.out.println("Soma dos quadrados: "+somaQuadrados);
        System.out.println("Média: "+(soma/i));
    }
}
