//package 2. media_elementos;

import java.util.Scanner;

public class media_elementos {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int elementsNumber;
        float[] array;
        float sum = 0, med, elementsValue; //soma dos elementos, média, valores dos elementos

        System.out.print("Digite a quantidade de elementos a serem lidos: ");
        elementsNumber = Read.nextInt();
        array = new float[elementsNumber];

        for(int i = 0; i < elementsNumber; i++){
            System.out.print("Digite um valor: ");
            elementsValue = Read.nextFloat();
            array[i] = elementsValue;

            sum += array[i]; 
        }

        med = sum / elementsNumber;
        
        System.out.println("");
        System.out.println("A média entre esses números é: " + med);
        Read.close();
    }
}
