package br.com.technocorp.classesabstratas.teste;

import br.com.technocorp.classesabstratas.modelo.Funcionario;
import br.com.technocorp.classesabstratas.modelo.Gerente;
import br.com.technocorp.classesabstratas.modelo.Vendedor;

public class ClassesAbstratasTeste {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Lagertha", "102325-89", 10000.0);
        Vendedor vendedor = new Vendedor("Ragnar", "88322-89", 2000.0, 50000.0);
        gerente.calculaSalario();
        vendedor.calculaSalario();
        System.out.println(gerente);
        System.out.println("--------------------------------------------------------");
        System.out.println(vendedor);
    }
}
