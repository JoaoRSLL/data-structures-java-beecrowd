import java.io.IOException;
import java.util.Scanner;

public class Main1177 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] n = new int[1000];
        int t = sc.nextInt();
        int cont = 0;

        for(int i = 0; i <1000;i++){
            n[i] = cont;
            System.out.printf("N[%d] = %d%n",i,n[i]);
            cont++;
            if(cont == t){
                cont =0;
            }
        }

        sc.close();
    }

}