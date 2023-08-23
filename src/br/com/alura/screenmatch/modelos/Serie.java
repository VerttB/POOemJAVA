package br.com.alura.screenmatch.modelos;

public class Serie extends ScreenMatch{
    private int temporadas;
    private int duracaoPorEpisodio;
    private boolean ativa;
    private int episodioPorTemporada;

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }
    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    @Override
    public int getDuracaoMinutos() {

        return temporadas * episodioPorTemporada * duracaoPorEpisodio;
    }
}
