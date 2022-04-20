package Lista02.exercicio1;

public class Estagiario extends Empregado {
    private float desconto;

    public Estagiario(int cod, String name, String email, float salario, int desconto) {
        super(cod, name, email, salario, desconto );
        this.desconto = desconto;}public void salario(int percentual){
        super.getSalario(percentual, - this.desconto);}}