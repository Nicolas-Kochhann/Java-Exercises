package example;

public class Arco {

    private String material;

    public Arco(String material) {
        if (material.toLowerCase().equals("ferro") || material.toLowerCase().equals("madeira") || material.toLowerCase().equals("platina")){
            this.material = material;
        } else {
            System.out.println("Esse material não existe");
        }
    }

    @Override
    public String toString(){
        return "Material do arco: "+this.material;
    }

}
