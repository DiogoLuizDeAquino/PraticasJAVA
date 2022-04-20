package com.company;

import Implementando_Conta_P.CCorrente;
import Implementando_Conta_P.CEspecial;
import Implementando_Conta_P.CInvestimento;
import Implementando_Conta_P.CPoupanca;


public class Main {



    public static void main(String[] args) {
        CCorrente conta1 = new CCorrente(1, 1000, "Ana");
        CEspecial conta2 = new CEspecial(2, 2000, "Joao", 5000);
        CPoupanca conta3 = new CPoupanca(3,1000, "Claudia",1000);
        CInvestimento conta4 = new CInvestimento(4, 1000, "Cida", 8, 10);
        CInvestimento conta5 = new CInvestimento(5, 1000, "Eva", 22, 5);

        //Conta Corrente
        conta1.debitar(2000);
        conta1.debitar(500);
        System.out.println("Seu saldo e: " + conta1.get_saldo());
        conta1.creditar(1000);
        System.out.println("Seu saldo e: " + conta1.get_saldo());
        System.out.println("----------------------------------------");

        //Conta Especial
        conta2.debitar(10000);
        conta2.debitar(3000);
        System.out.println("Seu saldo e: " + conta2.get_saldo());
        conta2.creditar(2000);
        System.out.println("Seu saldo e: " + conta2.get_saldo());
        System.out.println("----------------------------------------");

        //Conta Poupança
        conta3.debitar(1500);
        conta3.debitar(500);
        System.out.println("Seu saldo é: " + conta3.get_saldo());
        System.out.println("Seu saldo mínimo é: " + conta3.get_saldominimo());
        conta3.creditar(1500);
        System.out.println("Seu saldo é: " + conta3.get_saldo());
        System.out.println("Seu saldo mínimo é: " + conta3.get_saldominimo());
        conta3.atualizar_saldo();
        System.out.println("Seu saldo é: " + conta3.get_saldo());
        System.out.println("Seu saldo mínimo é: " + conta3.get_saldominimo());
        System.out.println("----------------------------------------");

        //Conta Investimento
        conta4.atualizar_saldo();
        System.out.println("Seu saldo é: " + conta4.get_saldo());
        conta5.atualizar_saldo();
        System.out.println("Seu saldo é: " + conta5.get_saldo());
    }
}

//    public static void main(String[] args) {
//        pobre pobreza = new pobre("A", 27);
//        System.out.println(pobreza.trabalha()
//        rico ricão = new rica("B", 32, 1200);
//        System.out.println(ricão.fazCompras());


//    public static void main(String[] args) {
//        Tecnico tec = new Tecnico("Diogo","@diogo", "XV",9999-9999,202201);
//        Administrativo adm = new Administrativo("Eric", "@eric", "XVII", 8888-8888, 202202);
//        System.out.println("Funcionario "  + tec.getNome() + " de matricula "  +tec.getMatricula()+  " mora no endereco " +tec.getEndereco()+  ".");
//        System.out.println("Funcionario "  + adm.getNome() + " de matricula "  +adm.getMatricula()+  " mora no endereco " +tec.getEndereco()+  ".");}


//    public static void main(String[] args) {
//        Ingresso ingresso = new Ingresso();
//        Normal normal = new Normal();
//        CamaroteInferior camaroteinferior = new CamaroteInferior();
//        CamaroteSuperior camarotesuperior = new CamaroteSuperior();

//        VIP vip = new VIP();
//        ingresso.setValorIngresso(20);
//        vip.setValorAdicional(0.7f);
//        camarotesuperior.setTaxaAdicional(0f);
//        normal.setValorIngresso(20);

//        normal.imprimeingressoNormal(normal.getValorIngresso());
//        camaroteinferior.setLocalIngresso("terreo");
//        camaroteinferior.imprimeLocalizacao(camaroteinferior.getLocalIngresso());
//        camarotesuperior.setValorAdicional(65);
//        camarotesuperior.setValorIngresso(65);

//        System.out.println("Ingresso Vip Camarote Superior:"+ camarotesuperior.valorIngressoAdd(vip.getValorAdicional()));
//        System.out.println("Ingresso Vip:"+vip.valorIngressoVip(ingresso.getValorIngresso()));
//        System.out.println("Ingresso Vip Camarote Inferior:"+vip.valorIngressoVip(ingresso.getValorIngresso()));
//    }
//


//    public static void main(String[] args) {
//        Empregado emp = new Empregado(01, "A", "@1", 1200, 5);
//        Chefe boss = new Chefe(02, "B", "@2", 1800, 5);
//        Estagiario esta = new Estagiario(03, "C", "@3", 1000, 5);

//        System.out.println("O empregado passa a receber R$" + emp.getSalario()+ ".");
//        System.out.println("O chefe passa a receber R$" + boss.getSalario()+  ".");
//        System.out.println("O estagiario passa a receber R$" + esta.getSalario() +  ".");
//
//    }
//}


//   public static void main(String[] args) {
//     cachorro dog = new cachorro("nome", "raca");
//       Gato cat = new Gato("nome", "raca");

//        System.out.println(cat.caminhar());
//        System.out.println(dog.caminhar());
//        System.out.println(cat.miar());
//        System.out.println(dog.latir());
//   }
//










