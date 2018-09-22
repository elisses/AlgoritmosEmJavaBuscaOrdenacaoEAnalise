package com.ElisFernanda;

public class Main {

    private static int buscaMenor(Produto[] produtos){

        int maisBarato = 0;
        for(int atual = 0; atual <= 4; atual++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    public static void main(String[] args) {

        Produto produtos[] = {
         new Produto("Lamborghini", 1000000),
         new Produto("Jipe", 46000),
         new Produto("Brasilia", 16000),
         new Produto("Smart", 46000),
         new Produto("Fusca", 17000)
        };

        int maisBarato = buscaMenor(produtos);

        System.out.println("Posição: " + maisBarato);
        System.out.println("O carro "+ produtos[maisBarato].getNome()+
                " é o mais barato. E o preço é: " + produtos[maisBarato].getPreco());

    }
}
