package easyQuestions;

import java.util.Scanner;

public class TotalCricketScore {
    public static void main(String[] args){
        int sum = 0;
        int[] runs = {1, 2, 3, 4, 6};
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int i=0; i<array.length; i++){
            int k = array[i]*runs[i];
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
