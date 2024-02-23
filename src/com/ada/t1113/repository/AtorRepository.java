package com.ada.t1113.repository;
import com.ada.t1113.model.ator.Ator;
import java.util.List;

public interface AtorRepository {
    public Ator inserir(Ator ator);

    public Ator atualizar(Ator ator);

    public Ator excluir(Ator ator);

    public List<Ator> pesquisarPorNome(String nome);
}
