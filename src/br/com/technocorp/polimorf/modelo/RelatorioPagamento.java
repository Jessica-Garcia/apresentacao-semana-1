package br.com.technocorp.polimorf.modelo;


public class RelatorioPagamento {

    // Parâmetros polimorficos: parâmetros genéricos que podem fazer referência para objetos mais específicos.

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.printf("Salário desse mês: %.2f%n", funcionario.getSalario());

        // para chamar métodos das classes filhas, mesmo usando parâmetros da classe mãe
        // (DownCasting: força a conversão da classe mãe para a classe filha)

        if(funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            System.out.printf("Participação nos lucros: %.2f%n", gerente.getPnl());
        }
        else if(funcionario instanceof Vendedor){
            Vendedor vendedor = (Vendedor) funcionario;
            System.out.printf("Total de vendas: %.2f%n", vendedor.getTotalVendas());
        }

    }
}
