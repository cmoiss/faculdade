package CalculoRetangulo;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        float largura;
        float altura;
        Scanner ler = new Scanner(System.in);
        Calculo calculo = new Calculo();

        System.out.print("Digite a largura do retângulo: ");
        largura = ler.nextFloat();
        
        System.out.print("Digite a altura do retângulo: ");
        altura = ler.nextFloat();

        calculo.getCalcularArea(largura, altura);
        calculo.getCalcularPerimetro(largura, altura);

        /*
        System.out.print("A área desse retângulo é: " + calculo.getCalcularArea(largura, altura));   
        System.out.print("O perímetro desse retângulo é: " + calculo.getCalcularArea(largura, altura)); 
        */

        /*
        System.out.println(Calculo.getCalcularArea(largura, altura));
        System.out.println(Calculo.getCalcularPerimetro(largura, altura));
        */


        ler.close();
    }
}
