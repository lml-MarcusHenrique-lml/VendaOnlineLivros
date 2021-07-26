package com.comandossimples;

public class LivroDigital extends Livro {

    private String formato;

    public LivroDigital(String autor) {super(autor);}

    @Override

    public boolean aPlicaDescontoDe(double porcentagem){
        if (porcentagem > 0.15){
            return false;
        }
        return super.aPlicaDescontoDe(porcentagem);
    }
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato =
                formato;
    }
}
