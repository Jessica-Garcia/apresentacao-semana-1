package br.com.technocorp.polimorf.modelo;

public class Gerente extends Funcionario implements Bonificavel {

    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public void calcularPagamento() {
        super.salario += pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    @Override
    public double calcularBonus(double valor) {
        return valor * 0.05;
    }
}
