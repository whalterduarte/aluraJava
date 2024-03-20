public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println(10-5);
        System.out.println("Filme : Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento );
        boolean  incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        System.out.println("Nota do filme : " + notaDoFilme);

        double media = (9.1 + 8.0 + 6.3) /3;
        System.out.println(" Media nota : "+media);
        String sinopse = "Filme de Aventura";
        System.out.println(sinopse);

        String password = "1234";
        if (password.equals("1234")){
            System.out.println("Access authorization");
        }else {
            System.out.println("Access not Authorization");
        }
    }
}
