package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Construa um programa que leia três valores numéricos (representados
        //pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
        //segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
        //quantas raízes reais a equação possui (delta < 0 – mostrar uma
        //mensagem dizendo que a equação não possui raízes reais, delta > 0 –
        //mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
        //uma única raiz real).

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor A: ");
        double a = Double.parseDouble(leitor.nextLine());

        System.out.print("Valor B: ");
        double b = Double.parseDouble(leitor.nextLine());

        System.out.print("Valor C: ");
        double c = Double.parseDouble(leitor.nextLine());

        double delta = (Math.pow(b, 2) - 4 * (a) * (c));

        if (delta < 0){
            System.out.println("Não possui raízes reais");
        } else if (delta == 0){
            System.out.println("Possui uma única raiz real");
        } else {
            System.out.println("Possui duas raízes reais");
        }
    }
}
