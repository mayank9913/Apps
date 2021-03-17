package dsa12;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loop = n / 2;

        for (int i = 2; i <= loop; i++) {
            if (n % i == 0) {
                flag = 1;
            }

        }
        if (flag == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }


    }
}
