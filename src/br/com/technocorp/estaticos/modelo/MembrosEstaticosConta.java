package br.com.technocorp.estaticos.modelo;

public class MembrosEstaticosConta {

    private int agencia;
    private int numero;
    private String titular;
    private double saldo;
    private static int total;

    public MembrosEstaticosConta() {

    }

    public MembrosEstaticosConta(int agencia, int numero) {
        MembrosEstaticosConta.total++;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        //System.out.println("O total de contas é: " + MembrosEstaticosConta.total);

    }

    public static int getTotal() {

        return MembrosEstaticosConta.total;
    }

    public int getAgencia() {

        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.agencia = agencia;
        }

    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Valor invalido");
        } else {
            this.numero = numero;
        }

    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void deposita(double valor) {

        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public String toString() {
        return "agencia: " + agencia +
                ", numero: " + numero +
                ", saldo: " + String.format("%.2f", saldo);
    }
}
