package example;

public class Espada {

    private String elemento;

    public Espada(String elemento) {
        if (elemento.toLowerCase().equals("fogo") || elemento.toLowerCase().equals("água") || elemento.toLowerCase().equals("terra") || elemento.toLowerCase().equals("ar")){
            this.elemento = elemento;
        } else {
            System.out.println("Este elemento não existe");
        }
    }

    @Override
    public String toString(){
        return "Elemento da espada: "+this.elemento;
    }
}
