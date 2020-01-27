package br.com.technocorp.classesabstratas.modelo;

public class Gerente extends Funcionario {


    public Gerente() {
        super();
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
       super.salario +=  (salario *0.2);
    }

    @Override
    public String toString() {
        return "Gerente: " + "\n" + super.toString();
    }
}
