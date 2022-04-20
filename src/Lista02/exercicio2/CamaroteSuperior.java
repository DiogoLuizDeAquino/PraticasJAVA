package Lista02.exercicio2;

public class CamaroteSuperior extends VIP{
    float TaxaAdicional;

    public void setTaxaAdicional(float valor){
        this.TaxaAdicional = valor;}

    public float getTaxaAdicional(){
        return this.TaxaAdicional;}

    public float valorIngressoAdd(float valor){
        valor= this.ValorAdicional;
        float valorAdd =(this.TaxaAdicional*this.ValorIngresso)*2+this.ValorIngresso;

        return valorAdd;}}
