package com.comandossimples;

public class Livro {



    private String nome;
    private String isbn;
    private String autor;
    private double valor;
    private boolean digital;

    public Livro(String autor){
        this.autor = autor;
    }

    public boolean aPlicaDescontoDe(double porcentagem) {
            if (porcentagem > 0.3) {
                return false;
            } else if (this.digital && porcentagem > 0.15){
                    return false;
            }
            this.valor -= this.valor * porcentagem;
                return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome =
                nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn =
                isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor =
                autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor =
                valor;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital =
                digital;
    }
}
