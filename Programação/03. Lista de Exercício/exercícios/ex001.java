import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
    
        int[] ponto_01 = new int[2];
        int[] ponto_02 = new int[2];
        
        System.out.println("Digite as coordenadas do ponto 1 (x1, y1)");

        ponto_01[0] = Ler.nextInt();
        ponto_01[1] = Ler.nextInt();
        
        espaço_branco();
        System.out.println("Ótimo, agora digite as coordenadas do ponto 2 (x2, y2)");
        
        ponto_02[0] = Ler.nextInt();
        ponto_02[1] = Ler.nextInt();

        espaço_branco();
        calcular_distancia(ponto_01, ponto_02);
        
        Ler.close();
    }

    public static void calcular_distancia(int[] P1, int[] P2) {
        //distância = raiz de ((x2-x1)² + (y2 - y1)²) 
        double x, y, distancia;
        
        x = P2[0] - P1[0];
        x =  Math.pow(x, 2);

        y = P2[1] - P1[1];
        y = Math.pow(y, 2);

        distancia = Math.sqrt(x + y);

        System.out.print("A distância entre o ponto 1 e o ponto 2, é: " + distancia);
    }

    public static void espaço_branco(){
        System.out.print("");
    }
}
