package br.com.alura.screenmatch.modelos;

public class ScreenMatch {
    private String nome;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private String genero;
    private boolean incluidoNoPlano;
    private int totalAvaliacoes;

    public void exibeInformacoes(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    public double retornaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

}
