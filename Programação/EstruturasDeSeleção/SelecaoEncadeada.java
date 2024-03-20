import java.util.Scanner;

public class SelecaoEncadeada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if (nota >= 90) {
            System.out.println("Sua nota é A.");           
        }
        else

        if (nota >= 80) {
            System.out.println("Sua nota é B.");
        }
        else

        if (nota >= 70) {
            System.out.println("Sua nota é C.");
        }
        else

        if (nota >= 60) {
            System.out.println("Sua nota é D.");
        }
        else
            
        System.out.println("Sua nota é F.");

        sc.close();
        }
}
