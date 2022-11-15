package com.lista.encadeada.ListaEncadeada.aulas;

import com.lista.encadeada.ListaEncadeada.models.ListaEncadeada;

public class Aula02 {
    public static void main( String[] args ) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho: " + lista.getTamanho());
        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println(lista);
        System.out.println("Tamanho: " + lista.getTamanho());





    }
}
