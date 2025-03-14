package exercicio3;

import java.text.BreakIterator;

public class Exercicio3 {
    public static void main(String[] args) {
        //Crie um programa Java para exibir os quadrados de números digitados
        //pelo usuário, até que ele digite um número negativo.

        int i = 1;
        while (true){
            System.out.print("Digite o "+i+"º número: ");
            int entrada = Integer.parseInt(System.console().readLine());
            if (entrada < 0){
                System.out.println("Saindo...");
                break;
            }
            System.out.println(" Quadrado de "+entrada+": "+Math.pow(entrada, 2));
            i++;
        }
    }
}
