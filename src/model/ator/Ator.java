package model.ator;

public class Ator {
    private String nome;
    private String sobrenome;
    private String nacionalidade;

    protected Ator (){

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    protected void setNome (String nome){
        this.nome = nome;
    }

    protected void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }

    protected void setNacionalidade (String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

}
