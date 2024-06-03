import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float valor, somaColunas = 0;
    float[][] matrizA = new float[4][5];
    float[] vetorB = new float[5];
    
    //Preencher matriz
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 5; j++) {
        System.out.print("Digite o valor da linha " + (i+1) + " e coluna " + (j+1) + " da matriz: ");
        valor = ler.nextFloat();
        matrizA[i][j] = valor;
      }
      espaçoVazio();
    }

    //Preenche vetor
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 4; j++) {
            somaColunas = somaColunas + matrizA[j][i];
        }
        
        vetorB[i] = somaColunas;
        somaColunas = 0;
    }

    //Imprime a matrizA
    System.out.println("=== MATRIZ A ===");
    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 5; j++) {
            System.out.print("|");
            System.out.print(matrizA[i][j] + "|");
        }
        espaçoVazio();
    }
    espaçoVazio();

    //Imprime o vetorB
    System.out.println("=== VETOR B ===");
    for(int i = 0; i < 5; i++) {
        System.out.print("|");
        System.out.print(vetorB[i] + "|");    
    }
    
    espaçoVazio();
    ler.close();
    }

    private static void espaçoVazio() {
        System.out.println(" ");
    } 
}