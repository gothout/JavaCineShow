package com.ada.t1113.model.filme;

public class Filme {
    private String nome;
    private int duracao;
    private String diretor;

    private static int nextId = 1;

    private Long id;

    public Filme(String nome, int duracao, String diretor){
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

    public String getDiretor() {
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

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void getId(Long id) {
        this.id = id;
    }

    public String toString() {
        return "- " +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao + " minutos" +
                ", diretor=" + diretor +
                ", id=" + id +
                '.';
    }

    

}
