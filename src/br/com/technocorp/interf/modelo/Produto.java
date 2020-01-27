package br.com.technocorp.interf.modelo;

public class Produto implements Tributavel, Transportavel {

    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.04;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\n" +
                "Peso: " + String.format("%.2f", peso) + " kg" + "\n" +
                "Preço: " + String.format("%.2f", preco) + "\n" +
                "Preço com imposto: " + String.format("%.2f", precoFinal) + "\n" +
                "Valor do Frete " + String.format("%.2f", valorFrete);
    }


    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
