public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2020;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        if (anoDeLancamento >= 2022) {
            System.out.println("O ano de lançamento e " + anoDeLancamento + " ATUALIZADO ");
        }else{
            System.out.println("O ano de lançamento e " + anoDeLancamento + " DESATUALIZADO");
        }
    }
}
