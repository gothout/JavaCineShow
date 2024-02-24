package com.ada.t1113.dto;

import com.ada.t1113.model.diretor.Diretor;

public record DiretorDto(String nome, int idade, String nacionalidade){
    public Diretor toDiretor() {
        return new Diretor(nome, idade, nacionalidade);
    }
}