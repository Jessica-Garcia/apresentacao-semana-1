package br.com.technocorp.heranca.modelo;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Salario: R$ " + String.format("%.2f", this.salario);

    }


}
