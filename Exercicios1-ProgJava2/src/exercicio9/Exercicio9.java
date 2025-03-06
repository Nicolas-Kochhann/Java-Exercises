package exercicio9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //.A nota final de um estudante é calculada a partir de três notas
        //atribuídas, respectivamente, a um trabalho de laboratório, a uma
        //avaliação semestral e a um exame final. A média das três notas
        //mencionadas obedece aos pesos a seguir:

        //Trabalho de laboratório 2
        //Avaliação semestral 3
        //Exame final 5

        //Faça um programa que receba as três notas, calcule e mostre a média
        //ponderada e o conceito que segue a tabela:

        //8,0 (inclusive) a 10,0 (inclusive) A
        //7,0 (inclusive) a 8,0 B
        //6,0 (inclusive) a 7,0 C
        //5,0 (inclusive) a 6,0 D
        //0,0 (inclusive) a 5,0 E

        Scanner leitor = new Scanner(System.in);

        System.out.print("Nota TL: (peso 2) ");
        double notaTL = Double.parseDouble(leitor.nextLine());

        System.out.print("Nota AS: (peso 3) ");
        double notaAS = Double.parseDouble(leitor.nextLine());

        System.out.print("Valor EF: (peso 5) ");
        double notaEF = Double.parseDouble(leitor.nextLine());

        double media = ((notaTL * 2) + (notaAS * 3) + (notaEF * 5))/10;

        String conceito = "";
        if (media <= 10.0 & media >= 8.0){
            conceito = "A";
        } else if (media < 8.0 & media >= 7.0 ) {
            conceito = "B";
        } else if (media < 7.0 & media >= 6.0) {
            conceito = "C";
        } else if (media < 6.0 & media >= 5.0) {
            conceito = "D";
        } else if (media < 5.0 & media >= 0.0) {
            conceito = "E";
        } else {
            conceito = "Desculpe, não foi possível carregar o conceito de sua nota";
        }

        System.out.println("Média: "+media);
        System.out.println("Conceito: "+conceito);

    }
}
