package com.comandossimples;

public class LivroFísico extends Livro {

    public LivroFísico(String autor) {
        super(autor);
        System.out.println("LivroFísico.LivroFísico");
    }


    public double getTaxaDeImpressao() {
        return this.getValor() * 0.05;
    }

    public boolean aPlicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        System.out.println("Desconto aplicando com sucesso!");

        return super.aPlicaDescontoDe(porcentagem);
    }

}