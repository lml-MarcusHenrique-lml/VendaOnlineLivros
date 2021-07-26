package com.comandossimples;

public class Main {

    public static void main(String[] args) {
        // write your code here
      /*  Livro livro = new Livro("       Autor: Marcus Henrique");
        livro.setValor(80);

        if (livro.aPlicaDescontoDe(0.3)) {
            System.out.println(livro.getAutor());
            System.out.print("       O livro com desconto irá custar: R$ ");
            System.out.println(livro.getValor());
            System.out.println("################################################################");
        } else {
            System.out.print(livro.getAutor()+" R$ ") ;
            System.out.println(livro.getValor());
            System.out.println("       Não foi possível aplicar o desconto!");
            System.out.println("################################################################");

        }

        Livro livroDigital = new LivroDigital("       Autor: Lara Vieira ");
        livroDigital.setValor(80);

        if (livroDigital.aPlicaDescontoDe(0.15)) {
            System.out.println(livroDigital.getAutor());
            System.out.print("       O livro com desconto irá custar: R$ ");
            System.out.println(livroDigital.getValor());
        } else {
            System.out.println(livroDigital.getAutor());
            System.out.print("       O livro com desconto irá custar: R$ ");
            System.out.println(livroDigital.getValor());
            System.out.print("       Não foi possível aplicar o desconto!");
        }

    }*/
        LivroFísico
                livroFísico =
                new LivroFísico("Autor: Marcus Henrique");
        livroFísico.setNome("Novo Java");
        livroFísico.setValor(50);

        LivroDigital
                livroDigital =
                new LivroDigital("Autor: Lara Vieira");
            livroDigital.setNome("JavaScript");
            livroDigital.setValor(40);


        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(livroFísico);
        carrinhoDeCompras.adiciona(livroDigital);

        System.out.println("Total de livros: "+ carrinhoDeCompras.getTotal());

    }
}