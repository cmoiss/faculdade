import java.util.Scanner;

public class input_frutas {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        String[] frutas = new String[5];
        int posicao;

        frutas[0] = "Gomu Gomu no Mi";
        frutas[1] = "Bara Bara no Mi";
        frutas[2] = "Mera Mera no Mi";
        frutas[3] = "Gura Gura no Mi";
        frutas[4] = "Yami Yami no Mi";

        System.out.println("Escolha a fruta: ");

        for(int i = 0; i < 5; i++){
            
            System.out.println(i + " - " + frutas[i]);
        }
        
        System.out.println("");
        System.out.print("Digite a posição desejada: ");
        posicao = Ler.nextInt();

        System.out.print(frutas[posicao]);
        Ler.close();
    }
}
