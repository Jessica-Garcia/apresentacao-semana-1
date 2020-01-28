package br.com.technocorp.polimorf.modelo;

public class Vendedor extends Funcionario implements Bonificavel {

    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }
    // método sobrescrito da classe mãe abstrata
    @Override
    public void calcularPagamento() {
        super.salario += totalVendas * 0.05;
    }
    // método sobrescrito da interface
    @Override
    public double calcularBonus(double valor) {
        return valor * 0.1;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

}
