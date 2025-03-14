package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventario<T> {

    private List<T> itens;

    public Inventario() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T item){
        itens.add(item);
    }

    public void mostrarInventario() {
        for (T item : itens) {
            System.out.println(item);
        }
    }

}
