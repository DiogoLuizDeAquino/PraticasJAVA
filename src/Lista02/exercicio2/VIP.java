package Lista02.exercicio2;

public class VIP extends Ingresso {
    public float ValorAdicional;

    public float getValorAdicional(){
        return this.ValorAdicional;}

    public void setValorAdicional(float valorAdicional){
        this.ValorAdicional = valorAdicional;}

    public float valorIngressoVip(float valoringresso){
        this.ValorIngresso = valoringresso;
        return this.ValorIngresso + (this.ValorAdicional* this.ValorIngresso);}}
