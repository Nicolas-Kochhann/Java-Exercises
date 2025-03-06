package exercicio8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //Uma empresa decide dar um aumento de 30% aos funcionários cujo
        //salário é inferior a 5000. Escreva um programa que possa ser utilizado
        //para efetuar o cálculo do salário reajustado de um funcionário, a partir
        //do valor do salário informado pelo usuário.

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o seu salário atual: ");
        double salary = Double.parseDouble(leitor.nextLine());

        if (salary <= 0) {
            System.out.println("Este não é um valor de salário válido");
        }
         else if (salary < 5000.0){
            System.out.println("Seu salário reajustado é: R$ "+ (salary + (salary * 0.30)));
        } else {
            System.out.println("Você não tem direito ao aumento");
        }

    }
}
