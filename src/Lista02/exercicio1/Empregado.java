package Lista02.exercicio1;

public class Empregado {
    private int codigo, desconto;
    private String nome, email;
    private float salario, percentual;

    public Empregado(int codigo, String name, String email, float salario, float percentual) {
        this.codigo = codigo;
        this.nome = name;
        this.email = email;
        this.salario = salario;
        this.percentual = percentual;
        this.desconto = desconto;}

    public void setSalario() {
        this.salario += this.salario * this.percentual / 100;
    }
    public float getSalario() {setSalario();
        return (this.salario);}
    protected void getSalario(int percentual, float beneficio) {

    }

    public void setDesconto(int desconto) {
        this.desconto -= this.desconto - this.salario;
    }
}