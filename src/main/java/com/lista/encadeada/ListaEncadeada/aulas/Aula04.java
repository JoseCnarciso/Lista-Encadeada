package com.lista.encadeada.ListaEncadeada.aulas;

import com.lista.encadeada.ListaEncadeada.models.ListaEncadeada;

public class Aula04 {
    public static void main( String[] args ) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        System.out.println("Tamanho: " + lista.getTamanho());

        lista.adiciona(1);
        System.out.println(lista);
        System.out.println("Tamanho: " + lista.getTamanho());

        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println(lista);
        System.out.println("Tamanho: " + lista.getTamanho());


        lista.limpar();
        System.out.println(lista);





    }
}
