import java.util.Scanner;

public class soma_elementos {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int[] array = {3, 5, 7}; 
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum = sum + array[i];
        }

        System.out.println("A soma entre os elementos é: " + sum);
        Read.close();
    }
}