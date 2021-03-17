package moderate;

import java.util.Scanner;

public class CountSuchPairs {
    public static  void main(String[] args){
        int count = 0;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int target= sc.nextInt();
        int[] array = new int[n];
        for ( int i= 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for (int i= 0; i< array.length-1; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[i] + array[j] == target){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
