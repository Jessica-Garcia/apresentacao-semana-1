package br.com.technocorp.controledeacesso.modelo.pacote2;

import br.com.technocorp.controledeacesso.modelo.pacote1.ClasseA;

public class ClasseD {
    //Classe de pacote diferente

    public void visibilidadeClasseA() {
        ClasseA ca = new ClasseA();

//        ca.numeroDefault = 10; //Não é visivel
//        ca.numeroProtected = 30; //Não é visivel
        ca.numeroPublic = 15;
//        ca.numeroPrivado = 12; // Não é visivel
    }
}
