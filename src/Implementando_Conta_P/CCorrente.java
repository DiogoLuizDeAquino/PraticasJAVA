package Implementando_Conta_P;

public class CCorrente {

    private int numero;
    private double saldo;
    private String cliente;

    public CCorrente(int num, double sal, String cli){
        this.numero = num;
        this.saldo = sal;
        this.cliente = cli;
    }

    public void creditar(double valor){
        this.saldo = this.saldo+valor;
    }

    public void debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }public double get_saldo(){
        return  this.saldo;
    }

    public void set_saldo(double saldo) {
        this.saldo = saldo;

    }
}
