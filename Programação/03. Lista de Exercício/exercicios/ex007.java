import java.util.Scanner;
public class ex007 {
    public static void main(String[] args) {
        double custoFabrica, percentagemDistribuidor, impostos, custoConsumidor;
        Scanner Ler = new Scanner(System.in);

        System.err.print("Digite o custo da fábrica: ");
        custoFabrica = Ler.nextDouble();

        percentagemDistribuidor = custoFabrica * 0.28;
        impostos = custoFabrica * 0.45;
        custoConsumidor = custoFabrica + percentagemDistribuidor + impostos;

        System.out.println("O custo ao consumidor final é: " + custoConsumidor);
        Ler.close();
    }
}
