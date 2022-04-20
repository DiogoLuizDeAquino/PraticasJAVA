package Lista02.exercicio1;

public class Chefe extends Empregado {
    private float beneficio;

    public Chefe(int cod, String name, String email, float salario, float beneficio) {
        super(cod, name, email, salario, beneficio );
        this.beneficio = beneficio;}

    public void salario(int percentual){
        super.getSalario(percentual, this.beneficio);
    }
}