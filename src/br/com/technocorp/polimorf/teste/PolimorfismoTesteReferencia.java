package br.com.technocorp.polimorf.teste;

import br.com.technocorp.polimorf.modelo.Funcionario;
import br.com.technocorp.polimorf.modelo.Gerente;
import br.com.technocorp.polimorf.modelo.Vendedor;

public class PolimorfismoTesteReferencia {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Joan", 9000.0, 2000.0);
        Funcionario vendedor = new Vendedor("Yuri", 2600.0, 20000.0);

        // A mesma operação em variáveis do mesmo tipo terão comportamentos diferentes conforme os objetos para os quais elas apontam

        gerente.calcularPagamento();
        vendedor.calcularPagamento();

        System.out.println(gerente);
        System.out.println();
        System.out.println(vendedor);
    }
}
