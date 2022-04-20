package Lista02.exercicio3;

public class Administrativo extends Assistente {
    private int turno;
    private  int bonusSalario;

    public Administrativo(String nome, String email, String endereco, int telefone, int matricula) {
        super(nome, email, endereco, telefone, matricula);
        this.turno = (turno % 10);
        this.bonusSalario = this.turno;}
}
