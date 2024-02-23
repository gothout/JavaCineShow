package com.ada.t1113.repository;
import com.ada.t1113.model.diretor.Diretor;
import java.util.List;

public interface DiretorRepository {
    public Diretor inserir(Diretor diretor);

    public Diretor atualizar(Diretor diretor);

    public Diretor excluir(Diretor diretor);

    public List<Diretor> pesquisarPorNome(String nome);
}
