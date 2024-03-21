import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner anoLancamento = new Scanner(System.in);

        System.out.println("Digite seu fime favorito");
        String filme = leitura.nextLine();
        System.out.println(" Seu filme favorito e :  " + filme);
        System.out.println(" Qual ano de lançamento ? ");
        int ano = anoLancamento.nextInt();
        System.out.println("O ano de lançãmento foi " + ano );
    }
}
