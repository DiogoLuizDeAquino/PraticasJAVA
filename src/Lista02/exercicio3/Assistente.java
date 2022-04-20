package Lista02.exercicio3;

public class Assistente extends Funcionario {
    private  int matricula;

    public Assistente(String nome, String email, String endereco, int telefone, int matricula){
        super(nome, email, endereco,telefone);
        this.matricula = matricula;}

    public int getMatricula() {
        return matricula;
    }
}



