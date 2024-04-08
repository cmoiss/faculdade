import java.util.Scanner;

public class media_idade {
    public static void main(String[] args) {
        int age, listSize = 0, med; //tamanho da lista //média entre idades
        int sumAge = 0; //armazena a soma entre idades
        int[] numPeople; //quantidade de pessoas  
        Scanner Read = new Scanner(System.in);

        void_space();
        System.out.print("Digite a quantidade de pessoas na lista: ");
        listSize = Read.nextInt();

        numPeople = new int[listSize];

        for(int i = 0; i < listSize; i++) {
            System.out.print("Digite a idade da pessoa "+ (i + 1) + ": ");
            age = Read.nextInt();

            if(age >= 0) {
                sumAge = sumAge + age;
            }
        }
                
        med = sumAge / listSize;

        void_space();
        System.out.println("A média entre essas idades é: " + med);
        void_space();
        
        Read.close();
    }

    public static void void_space() {
        System.out.println("");
    }
}
