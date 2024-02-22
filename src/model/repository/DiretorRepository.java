package model.repository;
import model.diretor.Diretor;
import java.util.List;

public interface DiretorRepository {
    public Diretor inserir(Diretor diretor);

    public Diretor atualizar(Diretor diretor);

    public Diretor excluir(Diretor diretor);

    public List<Diretor> pesquisarPorNome(String nome);
}
