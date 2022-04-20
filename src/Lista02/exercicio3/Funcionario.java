package Lista02.exercicio3;

public class Funcionario {
    private String nome, email, endereco;
    private int telefone, matricula;

    public Funcionario(String nome, String email, String endereco, int telefone) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;}

    public String getNome() {

        return nome;
    }
    public String getEmail() {

        return email;
    }
    public String getEndereco() {

        return endereco;
    }
    public int getTelefone() {

        return telefone;
    }
    public int getMatricula() {

        return matricula;}
}
