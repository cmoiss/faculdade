public class preenchendo_pares {
    public static void main(String[] args) {
        int[] array = new int[21];
        
        for(int i = 0; i <= array.length; i++) {
            if(i % 2 == 0) {
                array[i] = i;
                System.out.println(array[i]);
            }  
        }
    }
}