import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        float x, y;
        int[] valorCoeficientes = new int[6]; //valor dos coeficientes
        String[] coeficientes = {"a", "b", "c", "d", "e", "f"};
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite os coeficientes");
        
        for(int i = 0; i < coeficientes.length; i++) {
            System.out.print(coeficientes[i] + ": ");
            valorCoeficientes[i] = Ler.nextInt();
        }

/*
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        System.out.print("O resultado de x é: " + x);
        System.out.print("E o resultado de y é: " + y);

        Ler.close();
*/
    }
}
