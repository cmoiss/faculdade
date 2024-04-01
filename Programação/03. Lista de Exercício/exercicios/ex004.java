import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
    int years, months, days;
    int yearsInDays;
    Scanner Read = new Scanner(System.in);   

    System.out.print("Digite sua idade expressa em dias: ");
    yearsInDays = Read.nextInt();

    years = yearsInDays / 365;
    int remainingDays = yearsInDays % 365;

    months = remainingDays / 30;
    days = remainingDays % 30;

    System.err.println("Você possui " + years + " anos, " + months + " meses e " + days + " dias de idade");
    Read.close();
    }
}

/*
==== ADICIONAR FUNÇÕES EXTRAS ====
- Verificador de número negativo
- Gramática adequada (singular/plural) 
*/