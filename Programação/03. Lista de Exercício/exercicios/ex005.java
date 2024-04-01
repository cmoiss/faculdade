import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        int nota01, nota02, nota03, mediaFinal;
        Scanner Ler = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota01 = Ler.nextInt();

        System.out.print("Digite a segunda nota: ");
        nota02 = Ler.nextInt();

        System.out.print("Digite a terceira nota: ");
        nota03 = Ler.nextInt();

        mediaFinal = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)) / 10;

        System.out.println("Sua média final é: " + mediaFinal);
        Ler.close();
    }
}
