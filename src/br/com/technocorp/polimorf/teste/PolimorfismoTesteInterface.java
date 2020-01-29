package br.com.technocorp.polimorf.teste;

import br.com.technocorp.polimorf.modelo.Gerente;
import br.com.technocorp.polimorf.modelo.Bonificavel;
import br.com.technocorp.polimorf.modelo.Vendedor;

public class PolimorfismoTesteInterface {
    public static void main(String[] args) {
        Bonificavel gerente = new Gerente("Joan", 9000.0, 2000.0);
        Bonificavel vendedor = new Vendedor("Joan", 9000.0, 20000.0);

        System.out.printf("Bonificação do gerente: %.2f%n", gerente.calcularBonus(50000.0));
        System.out.printf("Bonificação do vendedor: %.2f%n", vendedor.calcularBonus(50000.0));
    }
}
