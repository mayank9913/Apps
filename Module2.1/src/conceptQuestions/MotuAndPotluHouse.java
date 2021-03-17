package conceptQuestions;

import java.util.Scanner;

public class MotuAndPotluHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = 0;
        while (target > 0) {
            if (target >= 5) {
                target -= 5;
                count++;
                continue;
            } else if (target == 4) {
                count++;
                break;
            } else if (target == 3) {
                count++;
                break;
            } else if (target == 2) {
                count++;
                break;
            } else if (target == 1) {
                count++;
                break;
            }

        }
        System.out.println(count);

    }
}
