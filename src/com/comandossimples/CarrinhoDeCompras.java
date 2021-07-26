package com.comandossimples;

public class CarrinhoDeCompras  {

    private double total;

    public void adiciona(Livro livro){
        System.out.println("Adicionado"+ livro);
                livro.getValor();
        livro.aPlicaDescontoDe(0.3);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
