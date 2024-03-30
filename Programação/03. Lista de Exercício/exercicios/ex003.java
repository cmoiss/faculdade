import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int years, months, days;
        int yearsToDays, monthsToDays, ageInDays;

        //System.out.print("Digite sua idade em ");
        
        System.out.print("Digite quantos anos você tem: ");
        years = Read.nextInt();

        System.out.print("Você tem " + years + " anos e quantos meses? ");
        months = Read.nextInt();

        System.out.print("Ótimo! Você tem " + years + " anos, " + months + " meses e quantos dias? ");
        days = Read.nextInt();

        yearsToDays = years * 365;
        monthsToDays = months * 30;
        ageInDays = yearsToDays + monthsToDays + days;

        System.out.println("Sua idade convertida em dias é: " + ageInDays);

        Read.close();
    }
}
