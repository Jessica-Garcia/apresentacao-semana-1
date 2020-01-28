package br.com.technocorp.polimorf.modelo;

public class Gerente extends Funcionario implements Bonificavel {

    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }
// método sobrescrito da classe mãe abstrata
    @Override
    public void calcularPagamento() {
        super.salario += pnl;
    }
// método sobrescrito da interface
    @Override
    public double calcularBonus(double valor) {
        return valor * 0.05;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

}
