package br.com.alura.screenmatch.model;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacaoes(){
        return totalDeAvaliacaoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacaoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacaoes;
    }
}
