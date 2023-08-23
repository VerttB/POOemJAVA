package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.ScreenMatch;

public class FiltroRecomendacao {
    public void filtraRecomendacao(Classificacao c){
        if (c.getClassificacao() >= 4)
            System.out.println("Está entre os preferidos");
        else if (c.getClassificacao() >= 2)
            System.out.println("Mais ou menos");
        else
            System.out.println("Coloque em assistir mais tarde");




    }
}
