package Lista02.exercicio2;

public class Ingresso {
    public float ValorIngresso;

    public float getValorIngresso(){
        return this.ValorIngresso;
    }

    public void setValorIngresso(float valorIngresso){
        this.ValorIngresso = valorIngresso;
    }
    public void imprimeValor(float valor){
        valor = this.ValorIngresso;

        System.out.printf("Valor do Igresso:"+ valor);
    }
}