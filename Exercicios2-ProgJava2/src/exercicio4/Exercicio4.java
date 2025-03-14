package exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        //Faça um programa que receba várias idades, calcule e mostre a média
        //das idades digitadas. Finalize digitando idade igual a zero.

        int i = 0;
        double soma = 0;
        while (true){
            System.out.print("Digite o "+(i+1)+"º idade: ");
            double entrada = Double.parseDouble(System.console().readLine());
            if (entrada == 0){
                break;
            }
            soma += entrada;
            i++;
        }
        System.out.println("Média: "+ (soma/i));
    }
}
