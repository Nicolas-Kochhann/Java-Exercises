package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Faça um programa que leia um valor numérico inteiro. O programa deve
        //apresentar a mensagem “O valor está na faixa permitida”, caso o valor
        //informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
        //deve apresentar a mensagem “O valor está fora da faixa permitida”.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor: ");
        int valor = Integer.parseInt(leitor.nextLine());

        if (valor >= 1 && valor <= 9){
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}
