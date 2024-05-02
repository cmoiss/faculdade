package CalculoRetangulo;
import java.util.Scanner;

public class Retangulo {
    static float largura;
    static float altura;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculo calculo = new Calculo();

        espaçoVazio();
        System.out.print("Digite a largura do retângulo: ");
        largura = ler.nextFloat();
        
        System.out.print("Digite a altura do retângulo: ");
        altura = ler.nextFloat();

        espaçoVazio();
        calculo.getCalcularArea(largura, altura);
        calculo.getCalcularPerimetro(largura, altura);
        espaçoVazio();

        ler.close();
    }

    public static void espaçoVazio() {
        System.out.println("");
    }
}
