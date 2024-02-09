package model.filme;

import model.diretor.Diretor;

public class FilmeBuilder {
    private Filme filme = new Filme();

    public FilmeBuilder comTitulo(String titulo) {
        filme.setNome(titulo);
        return this;
    }

    public FilmeBuilder comGenero(String genero) {
        filme.setGenero(genero);
        return this;
    }

    public FilmeBuilder comAno(int ano) {
        filme.setAno(ano);
        return this;
    }

    public FilmeBuilder comDiretor(Diretor diretor) {
        filme.setDiretor(diretor);
        return this;
    }

    public Filme criar() {
        return filme;
    }

}
