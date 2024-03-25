package atividade_interativa;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class solicite_idade {
    public static void main(String args) {
        Scanner Read = new Scanner(System.in);
        int age;
        List <Integer> numPeople = new ArrayList<>(); //quantidade de pessoas  
        //int numPeople; //quantidade de pessoas

        /*
        System.out.print("Digite a quantidade de pessoas: ");
        numPeople = Read.nextInt();
        */

        do {
            System.out.println("Digite a idade: ");
            age = Read.nextInt();

            numPeople.add(age);
        } while(age >= 0);

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
