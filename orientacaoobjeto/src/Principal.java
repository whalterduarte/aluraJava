import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Naruto");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinuto(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(7);
        System.out.println("Duração do filme : " + meuFilme.getDuracaoEmMinuto());
        System.out.println("Media de avaliaçoes : " + meuFilme.pegaMedia() + " Total de avaliaçoes " + meuFilme.getTotalDeAvaliacao());

        Serie lost = new Serie();
        // Serie
        lost.setNome("Top gun");

    }
}
