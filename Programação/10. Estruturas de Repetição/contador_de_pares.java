public class contador_de_pares {
    public static void main(String[] args) {
        int i = 1;
        int resto;

//        i = i + 2;

        while (i <= 100) {
            resto = i % 2;
            if (resto == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
