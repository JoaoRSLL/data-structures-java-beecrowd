import java.io.IOException;
import java.util.Scanner;

public class Main1173 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int[] vet = new int[10];

        vet[0] = v;
        System.out.printf("N[0] = %d%n",vet[0]);
        for(int i = 1; i<10; i++){
            vet[i] = vet[i-1] *2;
            System.out.printf("N[%d] = %d%n",i,vet[i]);
        }
        sc.close();
    }

}