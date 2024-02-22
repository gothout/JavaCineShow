package model.repository.impl;

import model.repository.FilmeRepository;
import model.filme.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FilmeRepositoryImpl implements FilmeRepository {

    private List<Filme> filmes = new ArrayList<Filme>();
    @Override
    public Filme inserir(Filme filme) {
        filmes.add(filme);
        return filme;
    }

    @Override
    public Filme atualizar(Filme filme) {
        filmes.stream().filter(f -> f.getId().equals(filme.getId())).forEach(f -> {
            f.setNome(filme.getNome());
            f.setDuracao(filme.getDuracao());
            f.setDiretor(filme.getDiretor());
        });
        return filme;
    }

    @Override
    public Filme excluir(Filme filme) {
        filmes.stream().map(Filme::getId).collect(Collectors.toList()).remove(filme.getId());
        return filme;
    }

    @Override
    public List<Filme> pesquisarPorNome(String nome) {
        return filmes.stream().filter(f -> f.getNome().contains(nome)).collect(Collectors.toList());
    }
}
