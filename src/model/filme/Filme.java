package model.filme;

import model.diretor.Diretor;

public class Filme {
    private String nome;
    private int duracao;
    private Diretor diretor;

    private static int nextId = 1;

    private Long id;

    public Filme(String nome, int duracao, Diretor diretor) {
        this.nome = nome;
        this.duracao = duracao;
        this.diretor = diretor;
        this.id = (long) nextId++;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void getId(Long id) {
        this.id = id;
    }

    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", diretor=" + diretor +
                ", id=" + id +
                '}';
    }

    

}
