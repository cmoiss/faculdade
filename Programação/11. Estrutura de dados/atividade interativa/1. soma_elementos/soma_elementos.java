import java.util.Scanner;

public class soma_elementos {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int[] array; 
        int sum = 0;
        int elementNumber, elementValue; //quantidade de elementos, valor do elemento

        System.out.print("Digite quantos valores você gostaria de somar: ");
        elementNumber = Read.nextInt();
        array = new int[elementNumber];
        
        for(int i = 0; i < elementNumber; i++) {
            System.out.print("Digite um valor: ");
            elementValue = Read.nextInt();
            array[i] = elementValue;
            
            sum += array[i];
        }

        System.out.println("");
        System.out.println("A soma entre os elementos é: " + sum);
        Read.close();
    }
}