import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String numeros;
        int posiçao01, posiçao02, soma;

        espaçoVazio();
        System.out.print("Digite dois números: ");
        numeros = ler.nextLine();

        posiçao01 = numeros.charAt(0) - 48;
        posiçao02 = numeros.charAt(1) - 48;

        soma = posiçao01 + posiçao02;

        System.out.println("A soma entre esses números é: " + soma);
        espaçoVazio();

        ler.close();
    }

    public static void espaçoVazio() {
        System.out.println();
    }
}