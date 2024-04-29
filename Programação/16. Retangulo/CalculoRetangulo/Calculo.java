package CalculoRetangulo;
public class Calculo extends Retangulo {
    private void calcularArea(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
        float area = largura * altura;

        System.out.print("A área desse retângulo é: " + area);   
    }
}
