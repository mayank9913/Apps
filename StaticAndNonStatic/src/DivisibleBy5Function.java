public class DivisibleBy5Function {
    public static void main(String[] args) {

        DivisibleBy5Function divisible = new DivisibleBy5Function();
        boolean isDivisible = divisible.isDivisible(10);
        if (isDivisible) {
            System.out.println("Is Divisible");
        } else {
            System.out.println("not divisible");
        }

    }

    public boolean isDivisible(int number) {
        if (number % 5 == 0) {
            return true;
        }
        return false;
    }
}
