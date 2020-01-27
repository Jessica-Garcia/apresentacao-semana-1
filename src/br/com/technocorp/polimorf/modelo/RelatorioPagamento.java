package br.com.technocorp.polimorf.modelo;

import br.com.technocorp.heranca.modelo.Pessoa;

public class RelatorioPagamento {

    // Parâmetros polimorficos: parâmetros genéricos que podem fazer referência para objetos mais específicos.

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário desse mês: " + funcionario.getSalario());

        // para chamar métodos das classes filhas, mesmo usando parâmetros da classe mãe (DownCasting):

        if(funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + gerente.getPnl());
        }
        if(funcionario instanceof Vendedor){
            Vendedor vendedor = (Vendedor) funcionario;
            System.out.println("Total de vendas: " + vendedor.getTotalVendas());
        }

    }
}
