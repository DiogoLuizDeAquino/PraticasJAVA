package Lista02.exercicio2;

public class CamaroteInferior {
    String LocalIngresso;

    public String getLocalIngresso(){
        return this.LocalIngresso;}

    public void setLocalIngresso(String local){
        this.LocalIngresso = local;}

    public String acessaLocalizacao(){
        return this.LocalIngresso;

    }public void imprimeLocalizacao(String local) {
        local = this.LocalIngresso;

        System.out.println("Local:" + local);}
}
