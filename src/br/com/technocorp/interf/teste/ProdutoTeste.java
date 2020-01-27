package br.com.technocorp.interf.teste;

import br.com.technocorp.interf.modelo.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 2, 3000.0);

        produto.calcularImposto();
        produto.calculaFrete();
        System.out.println(produto);
    }
}
