import java.util.Scanner;

public class SelecaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 18){
			System.out.println("Você é maior de idade.");
		}
		else{
            System.out.println("Você eh gay!");
        }

		sc.close();
    }
}