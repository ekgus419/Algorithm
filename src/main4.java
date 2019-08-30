import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {

        int[] array = {1,10,4,8,5};
        int temp;
        for(int i=0; i<4; i++) {
            for(int j=i+1; j<5; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0; i<4; i++) {
            System.out.print(array[i]);
        }

    }
}
