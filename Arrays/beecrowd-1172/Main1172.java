import java.io.IOException;
import java.util.Scanner;

public class Main1172 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        for(int i = 0; i <10; i++){
            int x = sc.nextInt();

            if(x<= 0) {
                vet[i] = 1;
            }
            else{
                vet[i] = x;
            }
            System.out.printf("X[%d] = %d%n",i,vet[i]);
        }
        sc.close();
    }

}