package br.com.technocorp.estaticos.teste;

import br.com.technocorp.estaticos.modelo.MembrosEstaticosConta;


public class MembrosEstaticosTeste {
    public static void main(String[] args) {


        MembrosEstaticosConta conta1 = new MembrosEstaticosConta(1335, 24226);
        MembrosEstaticosConta conta2 = new MembrosEstaticosConta(1336, 16549);
        MembrosEstaticosConta conta3 = new MembrosEstaticosConta(1337, 25466);

        conta1.deposita(200.0);
        conta2.deposita(300.0);
        conta3.deposita(400.0);

        System.out.println("Conta 1: " + conta1);
        System.out.println("Conta 2: " + conta2);
        System.out.println("Conta 3: " + conta3);
        System.out.println();
        System.out.println("O total de contas é: " + MembrosEstaticosConta.getTotal());

    }
}
