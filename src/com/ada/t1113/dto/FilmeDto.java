package com.ada.t1113.dto;

import com.ada.t1113.model.filme.Filme;

public record FilmeDto(String nome, int duracao, String diretor){
    public Filme toFilme() {
        return new Filme(nome, duracao, diretor);
    }
}
