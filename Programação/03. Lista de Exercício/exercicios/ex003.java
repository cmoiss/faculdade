import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int years, months, days;
        int yearsToDays, monthsToDays, ageInDays;

        //System.out.print("Digite sua idade em ");
        
        do{
            System.out.print("Digite quantos anos você tem: ");
            years = Read.nextInt();

            if(years < 0) {
                voidSpace();
                System.out.println("Valor inválido! Digite um número maior ou igual a zero.");
            }
        } while(years < 0);      

        do{
            if (years == 1) {
                System.out.print("Você tem 1 ano e quantos meses? ");
                months = Read.nextInt();
            } else {
                System.out.print("Você tem " + years + " anos e quantos meses? ");
                months = Read.nextInt();
            }

            if(months < 0) {
                voidSpace();
                System.out.println("Valor inválido! Digite um número maior ou igual a zero.");
            }
        } while(months < 0);  

        do{
            System.out.print("Ótimo! Você tem " + years + " anos, " + months + " meses e quantos dias? ");
            days = Read.nextInt();

            if(days < 0) {
                voidSpace();
                System.out.println("Valor inválido! Digite um número maior ou igual a zero.");
            }
        } while(days < 0);

        yearsToDays = years * 365;
        monthsToDays = months * 30;
        ageInDays = yearsToDays + monthsToDays + days;

        System.out.println("Sua idade convertida em dias é: " + ageInDays);

        Read.close();
    }
    public static void voidSpace() {
        System.out.println("");
    }
}

/*

=== FUNÇÕES EXTRAS ===
- invalidar input é negativo
    - método voidSpace();

- ano OR anos
    - alterar de acordo com o valor 

- criar método invalidValue
    - mensagem diferente para erro

*/