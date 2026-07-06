import java.io.IOException;
import java.util.Scanner;

public class Main1178 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double[] n = new double[100];
        n[0] = x;
        System.out.printf("N[0] = %.4f%n",n[0]);
        for(int i = 1; i < 100; i++){
            n[i] = n[i-1]/2;
            System.out.printf("N[%d] = %.4f%n",i,n[i]);
        }

        sc.close();
    }

}