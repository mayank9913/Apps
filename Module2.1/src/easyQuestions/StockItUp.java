package easyQuestions;

import java.util.Scanner;

public class StockItUp {
    public static void main(String[] args) {
        int total = 0;
        int[] price = {550, 240, 84, 159, 80, 160, 252};
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[] ToBuy = new int[7];
        for (int i = 0; i < 7; i++) {
            ToBuy[i] = sc.nextInt();
            int k = price[i] * ToBuy[i];
            total = total + k;

        }
        int grandTotal = times * total;
        System.out.println(grandTotal);
    }

}
