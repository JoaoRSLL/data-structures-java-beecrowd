import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextInt();
        }
        Arrays.sort(vet);

        int cont = 1;
        for (int i = 1; i < n; i++) {
            if (vet[i] != vet[i - 1]) {
                System.out.printf("%d aparece %d vez(es)%n", vet[i - 1], cont);
                cont = 1;
            } else {
                cont++;
            }
        }
        System.out.printf("%d aparece %d vez(es)%n", vet[n - 1], cont);

        sc.close();
    }
}