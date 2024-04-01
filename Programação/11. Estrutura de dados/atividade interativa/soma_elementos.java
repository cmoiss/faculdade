import java.util.Scanner;

public class soma_elementos {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int[] array = {1, 2, 3}; 
        int sum = 0;


        for(int i = 0; i <= array.length; i++) {
            sum += array[i];
            System.out.println(i);
        }

        System.out.println("A soma entre os elementos é: " + sum);

        /*
        for(sum = 0; i <= i; i++) {
        }
        */        

        //System.out.println("A entre os termos é: " + sum);
        Read.close();
    }
}