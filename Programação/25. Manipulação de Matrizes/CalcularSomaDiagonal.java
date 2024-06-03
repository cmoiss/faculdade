import java.util.Scanner;

public class CalcularSomaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner ler = new Scanner(System.in);
        int[] diagonalPrincipal = new int[3];
        int valor, somaDiagonal;

        //Lê valores da matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da linha " + (i+1) + ", coluna " + (j+1) + ": ");
                valor = ler.nextInt();
                matriz[i][j] = valor;
            }
            
            espaçoVazio();
        }

        //Imprime a matriz já organizada
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            espaçoVazio();
        }

        //Verifica e preenche diagonal principal
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (i == j) {
                    diagonalPrincipal[i] = matriz[i][j];
                }
            }
        }

        espaçoVazio();

        somaDiagonal = diagonalPrincipal[0] + diagonalPrincipal[1] + diagonalPrincipal[2];

        System.out.println("A soma dos valores da diagonal principal é: " + somaDiagonal);
        
        espaçoVazio();
        ler.close();
    }

    private static void espaçoVazio() {
        System.out.println("");
    } 
}