package model.ator;

public class AtorBuilder {

    private Ator ator = new Ator();

    public AtorBuilder comNome(String nome) {
        ator.setNome(nome);
        return this;
    }

    public AtorBuilder comSobrenome(String sobrenome) {
        ator.setSobrenome(sobrenome);
        return this;
    }

    public AtorBuilder comNacionalidade(String nacionalidade) {
        ator.setNacionalidade(nacionalidade);
        return this;
    }

    public Ator criar() {
        return ator;
    }

}
