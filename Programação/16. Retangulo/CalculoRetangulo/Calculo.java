package CalculoRetangulo;
public class Calculo extends Retangulo {
    private float calcularArea(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
        float area = largura * altura;

        return area;
    }

    private float calcularPerimetro(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
        float perimetro = largura * altura;    

        return perimetro;
    }

    public void getCalcularArea(float largura, float altura) {
        float area = calcularArea(largura, altura);
        System.out.println("A área desse retângulo é: " + area);
    }

    public void getCalcularPerimetro(float largura, float altura) {
        float perimetro = calcularPerimetro(largura, altura);
        System.out.println("O perímetro desse retângulo é: " + perimetro);
    }
}
