//package 2. media_elementos;

public class media_elementos {
    public static void main(String[] args) {
        float[] array = {4, 5, 7};
        float sum = 0;
        float med;

        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
            sum += array[i]; 
        }

        med = sum / 3;
        System.out.println("");
        System.out.println("A média entre esses números é: " + med);
    }
}
