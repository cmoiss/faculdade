import java.util.Scanner;

public class verificar_vetores {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int[] primos = {2, 3, 5, 7};
        int entrada; //receber a entrada de dados do usuario
        do {
            System.out.print("Escolha um numero de 1 a 10: ");
            entrada = Ler.nextInt();
            
        } while (entrada > 0 && entrada <= 10);

        Ler.close();
    }
}
