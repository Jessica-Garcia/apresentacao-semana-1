package br.com.technocorp.heranca.modelo;

public class Endereco {

    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return  " Rua: " + rua +
                ", Bairro: " + bairro;
    }
}
