import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        int years, months, days;
        int yearsToDays, monthsToDays, ageInDays;

        //System.out.print("Digite sua idade em ");
        
        do {
            System.out.print("Digite quantos anos você tem: ");
            years = Read.nextInt();

            if (years < 0) {
                voidSpace();
                System.out.println("Valor inválido! Não existe 'ano negativo'. Portanto digite um número maior ou igual a 0.");
                //invalidValue(1); // "value" 1: ano
            }
        } while (years < 0);

        if(years == 1) {
            System.out.print("Você tem 1 ano e quantos meses? ");
            months = Read.nextInt();
        } else {
            do {
                if (years == 1) {
                    System.out.print("Você tem 1 ano e quantos meses? ");
                months = Read.nextInt();
                }
                System.out.print("Você tem " + years + " anos e quantos meses? ");
                months = Read.nextInt();
    
                if (months < 0) {
                    voidSpace();
                    System.out.println("Valor inválido! Não existe 'mês negativo'. Portanto digite um número maior ou igual a 0.");

                    //invalidValue(2); // "value" 2: mês
                }
            } while (months < 0);
        }
        



        System.out.print("Ótimo! Você tem " + years + " anos, " + months + " meses e quantos dias? ");
        days = Read.nextInt();

        yearsToDays = years * 365;
        monthsToDays = months * 30;
        ageInDays = yearsToDays + monthsToDays + days;

        System.out.println("Sua idade convertida em dias é: " + ageInDays);

        Read.close();
    }

    public static void voidSpace() {
        System.out.println(" ");
    }   

    /*
    public static void invalidValue(String value) {
        switch (value) {
            case "1":
                value = "ano";
                break;

            case "2":
                value = "mês";
                break;

            case "3":
                value = "dia";
                break;
        
            default:
                break;
        }

        System.out.println("Valor inválido! Não existe '" + value + " negativo'. Portanto digite um número maior ou igual a 0.");
    }
    */
}
