package br.com.technocorp.heranca.teste;

import br.com.technocorp.heranca.modelo.Endereco;
import br.com.technocorp.heranca.modelo.Funcionario;
import br.com.technocorp.heranca.modelo.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Yennefer","038.967.555.78");
        Endereco endereco = new Endereco();
        endereco.setBairro("Boa Vista");
        endereco.setRua("Nilo Peçanha");
        p.setEndereco(endereco);

        System.out.println(p);
        System.out.println("---------------------------------------------------------------------------------------------");

        Funcionario f = new Funcionario("Geralt", "029.867.600-88", 5000.0);
        endereco.setBairro("Bela Vista");
        endereco.setRua("Cabral");
        f.setEndereco(endereco);

        System.out.println(f);






    }
}
