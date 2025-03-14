package example;

public class Main {
    public static void main(String[] args) {

        Inventario<Object> inventario = new Inventario<>();

        inventario.adicionarItem(new Espada("Fogo"));
        inventario.adicionarItem(new Escudo("Grande"));
        inventario.adicionarItem(new Arco("Madeira"));

        System.out.println("Itens no inventario: ");
        inventario.mostrarInventario();

    }
}
