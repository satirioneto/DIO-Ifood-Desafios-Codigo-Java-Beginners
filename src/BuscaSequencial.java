import java.util.Scanner;

public class BuscaSequencial {
    public static void buscaSequencial() {
        Scanner leitor = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int N = leitor.nextInt();

        int indice = 0;

        for (int i = 0; i < elementos.length; i++) {

            if (elementos[i] == N) {
                indice = i;
                System.out.println("Achei " + N + " na posicao " + indice);
            }
        }
        if (indice == 0) {
                System.out.println("Numero " + N + " nao encontrado!");
        }
    }
}
