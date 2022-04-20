package Lista02.exercicio4;

public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    public String caminhar() {
        return  "Gato esta caminhando ";
    }
    public String miar()
    {
        return "Miau Miau";
    }

}
