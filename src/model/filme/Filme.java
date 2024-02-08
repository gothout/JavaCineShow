package model.filme;

import model.diretor.Diretor;

public class Filme {

    protected Filme (){

    }

    private String nome;
    private String genero;
    private int ano;
    private Diretor diretor;


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    protected void setNome (String nome){
        this.nome = nome;
    }

    protected void setGenero (String genero){
        this.genero = genero;
    }

    protected void setAno (int ano){
        this.ano = ano;
    }

    protected void setDiretor (Diretor diretor){
        this.diretor = diretor;
    }

}
