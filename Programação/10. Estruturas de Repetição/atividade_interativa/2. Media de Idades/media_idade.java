import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class media_idade {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int age;
        List <Integer> numPeople = new ArrayList<>(); //quantidade de pessoas  
        int listSize; //tamanho da lista
        int sumAge = 0; //armazena a soma entre idades
        int med; //média entre idades


        do {
            System.out.print("Digite a idade: ");
            age = Read.nextInt();

            if(age >= 0) {
                sumAge = sumAge + age;
            }

            numPeople.add(age);
            listSize = numPeople.size();



            if (age < 0) {
                listSize = listSize - 1;
            } else if(listSize == 1) {
                System.out.println("Lista atualizada, agora a lista possui " + listSize + " item. ");
                System.out.println(" ");

            } else {
                System.out.println("Lista atualizada, agora a lista possui " + listSize + " itens. ");
                System.out.println(" ");
            }
        } while(age >= 0);
        
        med = sumAge / listSize;

        System.out.print("A média entre essas idades é: " + med);
        Read.close();
    }
}
