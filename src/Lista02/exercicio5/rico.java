package Lista02.exercicio5;

public class rico extends pessoa {
    private double dinheiro;

public rico(String nome, int idade, double dinheiro) {
    super(nome, idade);
    this.dinheiro = dinheiro;
}
public String fazCompras(){
    return("Compre");
}
}
