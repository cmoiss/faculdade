import java.util.Scanner;

public class ex001 {
    public static String exercicio01() {
        Scanner Ler = new Scanner(System.in);
        int x1, y1, x2, y2, distancia;
        System.out.print("Digite o ponto x1 de A: ");
        x1 = Ler.nextInt();

        System.out.print("Digite o ponto y1 de A: ");
        y1 = Ler.nextInt();

        System.out.print("Digite o ponto x2 de B: ");
        x2 = Ler.nextInt();

        System.out.print("Digite o ponto y2 de B: ");
        y2 = Ler.nextInt();

        distancia = (x2 - x1) + (y2 - y1);
        System.out.print("A distância entre os pontos A e B é de: " + distancia);

        Ler.close();
        return null;
    }
}
