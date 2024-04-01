import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        int hours, minutes, seconds;
        int timeInSeconds;
        Scanner Read = new Scanner(System.in);

        System.out.print("Digite a duração do evento em segundos: ");
        timeInSeconds = Read.nextInt();

        hours = timeInSeconds / 3600;
        minutes = (timeInSeconds % 3600) / 60;
        seconds = timeInSeconds % 60;

        System.out.println("A duração desse evento é " + hours + " horas, " + minutes + " minutos e " + seconds + " segundos.");
        Read.close();
    }
}

/*
==== ADICIONAR FUNÇÕES EXTRAS ====
- Invalidar números negativos
- Verificar gramática correta: Singular e Plural (o certo é: "1 hora"; não "1 horas")
 */
