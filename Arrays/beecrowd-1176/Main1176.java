import java.io.IOException;
import java.util.Scanner;

public class Main1176 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long[] fib = new long[61];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i<61;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        int t = sc.nextInt();

        for(int i = 0; i<t;i++){
            int f = sc.nextInt();
            System.out.printf("Fib(%d) = %d%n",f,fib[f]);

        }

        sc.close();
    }

}