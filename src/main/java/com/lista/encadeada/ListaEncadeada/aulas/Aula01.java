package com.lista.encadeada.ListaEncadeada.aulas;

import com.lista.encadeada.ListaEncadeada.models.ListaEncadeada;

public class Aula01 {
    public static void main( String[] args ) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);


        System.out.println(lista);

    }
}
