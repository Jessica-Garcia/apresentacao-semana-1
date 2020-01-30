package br.com.technocorp.controledeacesso.modelo.pacote2;

import br.com.technocorp.controledeacesso.modelo.pacote1.ClasseA;

public class ClasseD {
    //Classe de pacote diferente

    public void visibilidadeClasseA() {
        ClasseA ca = new ClasseA();

        ca.numeroPublic = 15;

//        ca.numeroDefault = 10; //Não é visivel diretamente
//        ca.numeroProtected = 30; //Não é visivel
//        ca.numeroPrivado = 12; // Não é visivel

        ca.setNumeroDefault(10);
        ca.setNumeroProtected(30);
        ca.setNumeroPrivate(12);
    }
}
