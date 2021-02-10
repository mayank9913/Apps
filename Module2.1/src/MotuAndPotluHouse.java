import java.util.Scanner;

public class MotuAndPotluHouse {

    public static void main(String[] args) {
        int count = 0;
        int start = 0;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i =0 ; i< target; i++){
            if (target % 5 == 1) {
                count++;
                int remaining = target - 5;
            }
            System.out.println(count);


        }




    }
}
