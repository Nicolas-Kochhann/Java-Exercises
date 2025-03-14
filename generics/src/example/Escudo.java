package example;

public class Escudo {

    private String tamanho;

    public Escudo(String tamanho) {
        if (tamanho.toLowerCase().equals("pequeno") || tamanho.toLowerCase().equals("médio") || tamanho.toLowerCase().equals("grande")){
            this.tamanho = tamanho;
        } else {
            System.out.println("Esse tamanho não existe");
        }
    }

    @Override
    public String toString(){
        return "Tamanho do escudo: "+this.tamanho;
    }

}
