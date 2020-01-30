package br.com.technocorp.controledeacesso.modelo.pacote1;

public class ClasseA {
    protected int numeroProtected;
    private int numeroPrivate;
    int numeroDefault;
    public int numeroPublic;

    public ClasseA() {
    }

    public int getNumeroProtected() {
        return numeroProtected;
    }

    public void setNumeroProtected(int numeroProtected) {
        this.numeroProtected = numeroProtected;
    }

    public int getNumeroPrivate() {
        return numeroPrivate;
    }

    public void setNumeroPrivate(int numeroPrivate) {
        this.numeroPrivate = numeroPrivate;
    }

    public int getNumeroDefault() {
        return numeroDefault;
    }

    public void setNumeroDefault(int numeroDefault) {
        this.numeroDefault = numeroDefault;
    }

}
