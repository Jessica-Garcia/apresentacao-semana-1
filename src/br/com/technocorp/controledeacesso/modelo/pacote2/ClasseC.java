package br.com.technocorp.controledeacesso.modelo.pacote2;

import br.com.technocorp.controledeacesso.modelo.pacote1.ClasseA;

public class ClasseC extends ClasseA {
    //classe de pacote diferente que herda de classeA

    public void visibilidadeClasseA(){
        ClasseA ca = new ClasseA();

//        ca.numeroDefault = 10; não é visivel
        super.numeroProtected = 30;
        ca.numeroPublic = 15;
//        ca.numeroPrivado = 12; // Não é visivel

    }

}
