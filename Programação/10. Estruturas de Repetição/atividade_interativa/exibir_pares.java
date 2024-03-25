package atividade_interativa;
import java.util.Scanner;

public class exibir_pares {
    public static void main(String[] args){
        Scanner Read = new Scanner(System.in);
        int i = 0;
        int number;
        int resto;

        System.out.print("Digite um número: ");
        number = Read.nextInt();

//        System.out.println(0);

        while(i <= number){
            resto = i % 2;
            if (resto == 0) {
                System.out.println(i);
            }
            i++;
        }

        Read.close();

/*
        for(i=1; limit == number; i++){
            
        }
*/

    }
}
