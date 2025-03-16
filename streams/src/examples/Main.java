package examples;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Fruit x = new Fruit("Pineapple");
        Fruit y = new Fruit("Apple");
        Fruit z = new Fruit("Strawberry");

        ArrayList<Fruit> lista = new ArrayList<>();
        lista.add(x);
        lista.add(y);
        lista.add(z);

        lista.stream().forEach(fruit -> System.out.println(fruit.getName()));

    }
}
