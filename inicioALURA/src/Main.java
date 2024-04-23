//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // Padrão Camel case
        System.out.println("Ano de lançamento: " + anoDeLancamento); // Concatenação "+"
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) /3;

        //Condicional
        if (incluidoNoPlano) {
            System.out.println("O filme esta incluido no plano ");
        }
        else {
            System.out.println("Não incluso no plano");
        };
        System.out.println(media);
        //Metod Format
        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80
                Muito bom!
                """;
        System.out.println(sinopse);
        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}