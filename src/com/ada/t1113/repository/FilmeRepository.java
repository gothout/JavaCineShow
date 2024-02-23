package com.ada.t1113.repository;

import com.ada.t1113.model.filme.Filme;
import java.util.List;

public interface FilmeRepository{
    public Filme inserir(Filme filme);

    public Filme atualizar(Filme filme);

    public Filme excluir(Filme filme);

    public List<Filme> listarTodos();

    public List<Filme> pesquisarPorNome(String nome);
}
