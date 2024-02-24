package com.ada.t1113.repository.impl;

import com.ada.t1113.repository.DiretorRepository;
import com.ada.t1113.model.diretor.Diretor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DiretorRepositoryImpl implements DiretorRepository {

    private List<Diretor> diretores = new ArrayList<Diretor>();
    @Override
    public Diretor inserir(Diretor diretor) {
        diretores.add(diretor);
        return diretor;
    }

    @Override
    public Diretor atualizar(Diretor diretor) {
        return null;
    }

    @Override
    public Diretor excluir(Diretor diretor) {
        return null;
    }

  /*   @Override
   public Diretor atualizar(Diretor com.ada.t1113.view.diretor) {
        com.ada.t1113.view.diretor.stream().filter(f -> f.getId().equals(com.ada.t1113.view.filme.getId())).forEach(f -> {
            f.setNome(com.ada.t1113.view.filme.getNome());
            f.setDuracao(com.ada.t1113.view.filme.getDuracao());
            f.setDiretor(com.ada.t1113.view.filme.getDiretor());
        });
        return com.ada.t1113.view.filme;
    }

    @Override
    public Filme excluir(Filme com.ada.t1113.view.filme) {
        filmes.stream().map(Filme::getId).collect(Collectors.toList()).remove(com.ada.t1113.view.filme.getId());
        return com.ada.t1113.view.filme;
    }*/

    @Override
    public List<Diretor> pesquisarPorNome(String nome) {
        return diretores.stream().filter(f -> f.getNome().contains(nome)).collect(Collectors.toList());
    }

    @Override
    public List<Diretor> listarTodos() {
        System.out.println(diretores.stream().map(f -> f.toString()).collect(Collectors.joining("\n")));
        return new ArrayList<>(diretores);
    }
}
