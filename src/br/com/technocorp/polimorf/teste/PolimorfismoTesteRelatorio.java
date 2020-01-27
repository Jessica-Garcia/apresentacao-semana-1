package br.com.technocorp.polimorf.teste;

import br.com.technocorp.polimorf.modelo.Funcionario;
import br.com.technocorp.polimorf.modelo.Gerente;
import br.com.technocorp.polimorf.modelo.RelatorioPagamento;
import br.com.technocorp.polimorf.modelo.Vendedor;

public class PolimorfismoTesteRelatorio {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Joan", 9000.0, 2000.0);
        Funcionario vendedor = new Vendedor("Yuri", 2600.0, 20000.0);
        RelatorioPagamento relatorio = new RelatorioPagamento();

        relatorio.relatorioPagamentoGenerico(gerente);
        System.out.println("------------------------------------------------------------------------");
        relatorio.relatorioPagamentoGenerico(vendedor);

    }
}
