import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnoLancamento(2022);
        meuFilme.setGenero("Ação");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoMinutos(190);
        meuFilme.exibeInformacoes();
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

        Serie serie = new Serie();
        serie.setNome("The Witcher");
        serie.setAnoLancamento(2020);
        serie.exibeInformacoes();
        serie.setEpisodioPorTemporada(8);
        serie.setTemporadas(3);
        serie.setDuracaoPorEpisodio(48);
        System.out.println(serie.getDuracaoMinutos());

        CalculadoraDeTempo calculo = new CalculadoraDeTempo();
        calculo.somarDuracao(serie);
        calculo.somarDuracao(meuFilme);
        System.out.println(calculo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtraRecomendacao(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(40);
        filtro.filtraRecomendacao(episodio);


    }
   }

