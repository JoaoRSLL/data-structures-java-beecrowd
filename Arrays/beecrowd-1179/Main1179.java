import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main1179 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int pospar = 0;
        int posimpar = 0;

        for(int i = 0; i<15;i++){
            int n = sc.nextInt();

            if(n %2 == 0){
                par[pospar] = n;
                pospar++;
                if(pospar == 5){
                    for(int j = 0; j<5;j++){
                        System.out.printf("par[%d] = %d%n",j,par[j]);
                    }
                    pospar = 0;
                    Arrays.fill(par, 0);
                }
            }
            else{
                impar[posimpar] = n;
                posimpar++;
                if(posimpar == 5){
                    for(int k = 0; k<5;k++){
                        System.out.printf("impar[%d] = %d%n",k,impar[k]);
                    }
                    posimpar = 0;
                    Arrays.fill(impar, 0);
                }
            }

        }
        for(int i = 0; i<posimpar;i++){
            System.out.printf("impar[%d] = %d%n",i,impar[i]);
        }
        for(int i = 0; i<pospar;i++){
            System.out.printf("par[%d] = %d%n",i,par[i]);
        }
        sc.close();
    }

}