import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome( "O poderoso chefão" );
        meuFilme.setAnoDeLancamento(1950);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme " +meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacaoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar  " + lost.getNome()+ " " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome( "Avatar" );
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size() + " Primeiro filme "  + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.get(0).toString());
    }
}
