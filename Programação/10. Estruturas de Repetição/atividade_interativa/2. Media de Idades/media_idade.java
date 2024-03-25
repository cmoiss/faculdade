import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class media_idade {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int age;
        List <Integer> numPeople = new ArrayList<>(); //quantidade de pessoas  
        //int numPeople; //quantidade de pessoas
        int listSize; //tamanho da lista
        int med;

        
        /*
        System.out.print("Digite a quantidade de pessoas: ");
        numPeople = Read.nextInt();
        */

        do {
            System.out.print("Digite a idade: ");
            age = Read.nextInt();

            numPeople.add(age);
            listSize = numPeople.size();

            /*
            if (listSize < 0) {
                listSize = listSize - 1;
            } else 
            */

            if(listSize == 1) {
                System.out.println("Lista atualizada, agora a lista possui " + listSize + " item. ");
            } else {
                System.out.println("Lista atualizada, agora a lista possui " + listSize + " itens. ");
            }



            /*
            if (numPeople.get(age) > 1) {
                System.out.println("Lista atualizada, agora a lista possui " + numPeople.size() + " itens. ");
            } else {
                System.out.println("Lista atualizada, agora a lista possui " + numPeople.size() + " item. ");
            }
            */


        } while(age >= 0);

        listSize = listSize - 1;
        
        med = (numPeople.get(0) + numPeople.get(1)) / listSize;

        System.out.print("A média entre essas idades é: " + med);
/*
        for(numPeople = 0; age < 0; numPeople++) {

        }
*/

/*
        while (age >= 0) {
            System.out.println("Digite a idade: ");
            age = Read.nextInt(); 
        }
*/

        Read.close();
        
    }
}
