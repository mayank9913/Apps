public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 9, 17, 81,};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j < numbers[i]; j++) {

                boolean isPrime = true;

                if (numbers[i] % j == 0) {
                    isPrime = false;
                    break;

                }
                if (isPrime) {
                    System.out.println(numbers[i]);
                }

            }
        }
    }
}
