import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        float x, y;
        int[] valorCoeficientes = new int[6]; //valor dos coeficientes
        String[] coeficientes = {"a", "b", "c", "d", "e", "f"};
        Scanner Ler = new Scanner(System.in);
        
        espaço_vazio();
        System.out.println("Digite os coeficientes");
        
        for(int i = 0; i < coeficientes.length; i++) {
            System.out.print(coeficientes[i] + ": ");
            valorCoeficientes[i] = Ler.nextInt();
        }

        int a = valorCoeficientes[0];
        int b = valorCoeficientes[1];
        int c = valorCoeficientes[2];
        int d = valorCoeficientes[3];
        int e = valorCoeficientes[4];
        int f = valorCoeficientes[5];

        /* verificar se os valores estão corretos
        espaço_vazio();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        */
        
        if ((a * e) - (b * d) != 0) { // evita o erro: Exception in thread "main" java.lang.ArithmeticException: / by zero at ex008.main(ex008.java:24)
            x = ((c * e) - (b * f)) / ((a * e) - (b * d));
            y = ((a * f) - (c * d)) / ((a * e) - (b * d));

            espaço_vazio();
            System.out.println("O resultado de x é: " + x);
            System.out.println("E o resultado de y é: " + y);
            espaço_vazio();
        } else {
            espaço_vazio();
            System.out.println("Erro! O resultado da conta (a * e) - (b * d) resulta em zero.");
            System.out.println("Por favor digite novamente.");
        }

        Ler.close();
    }

    public static void espaço_vazio() {
        System.out.println("");
    }
}
