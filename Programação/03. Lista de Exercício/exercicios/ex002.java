//package exercicios;

import java.util.Scanner;
//import exercicios.ex001;

public class ex002 {
    public static void main(String[] args){
        int a, b, c, r, s, d;
        Scanner Read = new Scanner(System.in);

        do {
            System.out.print("Digite o valor de A, sendo ele um número positivo (>0): ");
            a = Read.nextInt();
        } while (a < 1);
        
        //ex001.espaço_branco();
        do {
            System.out.print("Digite o valor de B, sendo ele um número positivo (>0): ");
            b = Read.nextInt();
        } while (b < 1);

        //ex001.espaço_branco();
        do {
            System.out.print("Digite o valor de C, sendo ele um número positivo (>0): ");
            c = Read.nextInt();
        } while (c < 1);
    }
}
