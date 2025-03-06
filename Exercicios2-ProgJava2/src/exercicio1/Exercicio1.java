package exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        //Faça um programa que calcule a soma de dez números quaisquer
        //fornecidos pelo usuário

        int i = 1;
        double soma = 0;
        while (i <= 10){
            System.out.print("Digite o "+i+"º número: ");
            soma += Integer.parseInt(System.console().readLine());
            i++;
        }

        System.out.println("A soma dos números é: "+soma);

    }
}
