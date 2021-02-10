public class OddEvenNumbersAverage {
    public static void main(String[] args) {
        int sumeven = 0;
        int sumodd = 0;
        int countEven = 0;
        int countOdd = 0;
        int[] array = {34, -87, 23, 12, 98, -2, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumeven = sumeven + array[i];
                countEven++;
            }

        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 1) {
                sumodd = sumodd + array[i];
                countOdd++;
            }

        }

        int averageEven = sumeven / countEven;
        System.out.println(averageEven);

        int averageOdd = sumodd / countOdd;
        System.out.println(averageOdd);

    }
}
