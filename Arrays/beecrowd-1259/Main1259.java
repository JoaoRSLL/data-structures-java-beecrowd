import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main1259 {

    public static void main(String[] args) throws IOException {

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        int[] vet = new int[n];

        int cpar = 0;
        int cimpar = 0;

        for(int i=0; i<n; i++){
            vet[i] = sc.nextInt();
            if(vet[i] % 2 == 0){
                cpar++;
            } else {
                cimpar++;
            }
        }

        int[] par = new int[cpar];
        int[] impar = new int[cimpar];
        int ppar = 0;
        int pimpar = 0;

        for(int i = 0; i< n; i++){
            if(vet[i] % 2 == 0 ){
                par[ppar] = vet[i];
                ppar++;
            } else {
                impar[pimpar] = vet[i];
                pimpar++;
            }
        }

        Arrays.sort(par);
        Arrays.sort(impar);

        for(int i = 0; i<ppar;i++){
            System.out.println(par[i]);
        }

        for(int i = (pimpar-1); i>=0;i--){
            System.out.println(impar[i]);
        }

        sc.close();

    }

}