import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnoLancamento(2022);
        meuFilme.setGenero("Ação");
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeInformacoes();
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.retornaMedia());
    }
   }

