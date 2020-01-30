package br.com.technocorp.controledeacesso.modelo.pacote1;

public class ClasseB {
    //Classe do mesmo pacote

    public void visibilidadeClasseA(){
        ClasseA ca = new ClasseA();

        ca.numeroDefault = 10;
        ca.numeroProtected = 30;
        ca.numeroPublic = 15;

//        ca.numeroPrivado = 12; // Não é visivel se chamado diretamente, somente pode ser acessado através de métodos

        ca.setNumeroPrivate(12);
        ca.getNumeroPrivate();


    }
}
