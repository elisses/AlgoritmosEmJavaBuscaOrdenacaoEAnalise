package com.ElisFernanda;

import static com.ElisFernanda.Main.buscaMenor;

public class TestaOrdenacao {

    private static void ordena(Produto[] produtos, int quantidadeDeElemento){
        for(int atual = 0; atual < quantidadeDeElemento-1; atual++){
            System.out.println("Estou na casinha atual: "+atual);
            int menor = buscaMenor(produtos,atual, quantidadeDeElemento-1);
            System.out.println("trocando "+ atual + "com o "+ menor);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            System.out.println("trocando "+ produtoAtual.getNome() + "com o "+ produtoMenor.getNome());
            produtos[atual]= produtoMenor;
            produtos[menor]= produtoAtual;
        };
    };

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        ordena(produtos, produtos.length);
        for (Produto produto : produtos){
            System.out.println(produto.getNome() + " custa R$" + produto.getPreco());
        }
    };
}
