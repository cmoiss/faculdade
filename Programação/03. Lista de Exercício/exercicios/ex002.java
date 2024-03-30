import java.util.Scanner;
//import exercicios.ex001;

public class ex002 {
    public static void main(String[] args){
        int a, b, c;
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

        calculo_R(a, b);
        calculo_S(b, c);

        calculo_D(calculo_R(a, b), calculo_S(b, c));

        Read.close();
    }

    public static int calculo_R(int a, int b){
        //R = (A + B)²
        double r = Math.pow((a + b), 2);
        return (int) r;
    }

    public static int calculo_S(int b, int c){
        //S = (B + C)²
        double s = Math.pow((b + c), 2);
        return (int) s;
    }

    public static void calculo_D(int r, int s) {
        //d = (R + S) / 2;
        float d = (r + s) / 2;
        System.out.print("O resultado de D é : " + d);
    }
}
