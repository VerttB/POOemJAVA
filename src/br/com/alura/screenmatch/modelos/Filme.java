package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends ScreenMatch implements Classificacao {
    private String diretor;

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia() / 2;
    }
}
