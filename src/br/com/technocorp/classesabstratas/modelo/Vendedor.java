package br.com.technocorp.classesabstratas.modelo;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        super.salario +=  (totalVendas *0.05);
    }


    @Override
    public String toString() {
        return "Vendedor: " + "\n" + super.toString();
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
