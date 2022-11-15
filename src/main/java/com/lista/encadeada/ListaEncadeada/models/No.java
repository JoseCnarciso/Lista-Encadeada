package com.lista.encadeada.ListaEncadeada.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class No<T> {

    private T elemento;
    private No<T> proximo;

    public No( T elemento ) {
        this.elemento = elemento;
        this.proximo = null;
    }


}
