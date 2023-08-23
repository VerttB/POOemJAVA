package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.ScreenMatch;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void somarDuracao(ScreenMatch s){
        tempoTotal += s.getDuracaoMinutos();
    }
}
