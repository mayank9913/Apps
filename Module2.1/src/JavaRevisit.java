import java.util.Arrays;
import java.util.Scanner;

public class JavaRevisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int  i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int min= array[0];


        for ( int i = 0; i < array.length; i++) {

            if(array[i]<min){
                min = array[i];
            }

        }
        System.out.println(min);

        for ( int i = 0; i < array.length; i++) {

            if(array[i]>min){
                min = array[i];
            }

        }
        System.out.println(min);


    }

}
