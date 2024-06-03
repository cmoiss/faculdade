import java.util.Scanner;

public class ManipulaçaoDeMatrizes {
    static Scanner ler = new Scanner(System.in);
    static int[][] matriz = new int[3][6];

    public static void main(String[] args) {     
        preencherMatriz();
        imprimirMatriz();
        imprimirColunasImpares();
        imprimirDoisEQuatro();
        somarColunasUmDois();
        imprimirMatriz();
    }

    private static void espaçoVazio() {
        System.out.println("");
    } 

    private static void preencherMatriz() {
        int valor;
        
        //Preenche (lê) matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print("Digite o valor da linha " + (i+1) + " coluna " + (j+1) + ": ");
                valor = ler.nextInt();
                matriz[i][j] = valor;
            }
            espaçoVazio();
        }

        ler.close();
    }

    private static void imprimirMatriz() {
        //Imprime matriz
        System.out.println("   === MATRIZ ===   ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            espaçoVazio();
        }
        espaçoVazio();
    }

    private static void imprimirColunasImpares() {
        float somaColunasImpares = 0;

        //Imprime colunas ímpares
        System.out.println("=== COLUNAS ÍMPARES ===");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                if (j % 2 != 0) {
                    System.out.print("|" + matriz[i][j] + "|");
                    somaColunasImpares = somaColunasImpares + matriz[i][j];
                }
            }
            espaçoVazio();
        }
        espaçoVazio();

        //Imprime soma de colunas ímpares
        System.out.println("Soma dos elementos das colunas ímpares: " + somaColunasImpares);
        espaçoVazio();
    }

    private static void imprimirDoisEQuatro() {
        float somaColunasDoisQuatro = 0;

        //Imprime soma 2ª e 4ª colunas
        System.out.println("=== COLUNAS 2 e 4 ===");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                if (j == 1 || j == 3) {
                    System.out.print("|" + matriz[i][j] + "|");
                    somaColunasDoisQuatro = somaColunasDoisQuatro + matriz[i][j];
                }
            }
            espaçoVazio();
        }
        espaçoVazio();

        //Imprime média da soma das 2ª 4ª colunas 
        System.out.println("Média dos elementos da segunda e quarta colunas: " + (somaColunasDoisQuatro / 6));
        espaçoVazio();
    }

    private static void somarColunasUmDois() {
        //Somar valores das colunas 1 e 2
        //Substituir coluna 6 pelo resultado dessa soma

        int somaElementos = 0;
        int[] somaLinhas = new int[3];

        System.out.println("=== COLUNAS 1 E 2 ===");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                if (j == 0 || j == 1) {
                    //Imprime colunas 1 e 2
                    System.out.print("|" + matriz[i][j] + "|");
                    somaElementos = somaElementos + matriz[i][j];
                }
            }
            espaçoVazio();
            somaLinhas[i] = somaElementos;
            somaElementos = 0;
        }
        espaçoVazio();

        System.out.println("A soma dos elementos das colunas 1 e 2 é igual a: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("|" + somaLinhas[i] + "|");
        }
        espaçoVazio();

        for(int i = 0; i < 3; i++) {
            matriz[i][5] = somaLinhas[i];
        }
    }

}