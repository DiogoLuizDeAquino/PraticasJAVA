package Lista02.exercicio4;

public class cachorro extends Animal {


    public cachorro(String nome, String raca) {
        super(nome, raca);
    }
    public String caminhar() {
        return "Cachorro esta caminhando ";
    }
    public String latir()
    {
        return "Au au";
    }
}

