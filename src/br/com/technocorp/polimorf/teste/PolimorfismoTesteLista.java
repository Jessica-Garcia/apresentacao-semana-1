package br.com.technocorp.polimorf.teste;

import br.com.technocorp.polimorf.modelo.Funcionario;
import br.com.technocorp.polimorf.modelo.Gerente;
import br.com.technocorp.polimorf.modelo.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class PolimorfismoTesteLista {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Joan", 9000.0, 2000.0));
        funcionarios.add(new Vendedor("Yuri", 2600.0, 20000.0));

        double soma = 0.0;
        for(Funcionario f : funcionarios){
            soma += f.getSalario();
        }
        System.out.println("Soma dos salarios dos funcionários: " + soma);

        System.out.println("Nome dos funcionários:");
        for(Funcionario f : funcionarios){
            System.out.println(f.getNome());
        }
    }
}
