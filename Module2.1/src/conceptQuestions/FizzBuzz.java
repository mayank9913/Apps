package conceptQuestions;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for ( int i = 0; i < array.length; i++) {

            for(int j=0; j<array[i]; j++){
                if(j%3==0 && j%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(j%3==0){
                   System.out.println("Fizz");
               }else if(j%5==0){
                   System.out.println("Buzz");
               }else{
                   System.out.println(j);
               }
            }

        }

    }
}
