package exercicio5;

public class Exercicio5 {
    public static void main(String[] args) {
        //Crie um programa para ler a quantidade de litros de combustível e a
        //distância percorrida por um carro em várias viagens. O programa deve
        //calcular o consumo médio do carro, que é igual a média de quilômetros
        //por litro de todas as viagens. O número de viagens realizado deve ser
        //informado pelo usuário.

        System.out.print("Viagens realizadas: ");
        int numViagens = Integer.parseInt(System.console().readLine());

        int i = 0;
        double soma = 0;
        while (i < numViagens){
            System.out.print("Distância percorrida: (em KM) ");
            double distancia = Double.parseDouble(System.console().readLine());

            System.out.print("Litros gastos: ");
            double combustivel = Double.parseDouble(System.console().readLine());

            double mediaViagem = distancia/combustivel;
            soma += mediaViagem;

            i++;
        }
        System.out.println("O consumo médio foi de: "+(soma/i)+"km/L");
    }
}
