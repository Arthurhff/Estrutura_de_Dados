import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vetor04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("DEFINA O TAMANHO DO VETOR: ");
        int tamanho = scanner.nextInt();

        int[] vet = new int[tamanho];

        for (int i = 0; i < tamanho; i++)
            vet[i] = rand.nextInt(101); // numeros aleatorios

        Arrays.sort(vet);

        System.out.println("Vetor ordenado: " + Arrays.toString(vet));

        System.out.print("\nDigite o numero que esta procurando: ");
        int busca = scanner.nextInt();

        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {            // este while que faz a busca binaria
            int metade = (inicio + fim) / 2;

            if (vet[metade] == busca) {
                System.out.println("O numero " + busca + " esta no indice: " + metade);
                scanner.close();
                return;
            } else if (vet[metade] < busca)
                inicio = metade + 1;
            else
                fim = metade - 1;
        }

        System.out.println("O numero " + busca + " não foi gerado no vetor.");
        scanner.close();
    }
}
