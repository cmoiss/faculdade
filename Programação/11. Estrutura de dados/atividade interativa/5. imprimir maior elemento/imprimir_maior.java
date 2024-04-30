public class imprimir_maior {
    public static void main(String[] args) {
        int arraySize = 11;
        int[] array = new int[arraySize + 1];
        int higher = 0;

        for(int i = 0; i < array.length - 1; i++) {
            array[i] = i;
            System.out.println(array[i]);

            if(array[i] > array[i + 1]) {
                higher = array[i];   
            } else if(array[i] < array[i + 1]) {
                higher = array[i + 1];
            }

        }

        System.out.println("O maior elemento é: " + higher);
    }
}
