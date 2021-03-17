package doubt;

import java.util.Scanner;

public class IntersectionOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] array = new int[s];
        int[] array2 = new int[s];

        for(int i=0; i<s; i++){
            array[i] = sc.nextInt();
        }
        for(int j=0; j<s; j++){
            array2[j] = sc.nextInt();
        }

       for(int i=0; i<s; i++){
           for( int j=0; j<s; j++){
               if(array[i]==array2[j]){
                   System.out.println(array[i]);

                   break;
                }
           }

       }



    }
}
