public class ArraySum {
    public static void main(String[] args){
        int number[] = {34, -87, 23, 12, -2, 0};
        int sum = 0;

        for (int i=0; i<number.length; i++){
            sum = sum + number[i];
        }

        System.out.println(sum);



    }
}
