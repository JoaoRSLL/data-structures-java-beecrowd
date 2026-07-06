import java.io.IOException;
import java.util.Scanner;

public class Main1180 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for(int i = 0; i <n;i++){
            x[i] = sc.nextInt();
        }

        int menor = x[0];
        int pos = 0;

        for(int i = 0; i<n;i++){
            if(x[i]<menor){
                menor = x[i];
                pos = i;
            }
        }

        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+pos);

        sc.close();

    }

}