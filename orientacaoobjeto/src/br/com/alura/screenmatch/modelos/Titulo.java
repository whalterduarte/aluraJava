package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinuto;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinuto() {
        return duracaoEmMinuto;
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

    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme : " + nome);
        System.out.println("Ano de lançamento : " + anoDeLancamento);
    }
    public void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacao;
    }
}
