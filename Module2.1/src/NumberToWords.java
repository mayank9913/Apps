public class NumberToWords {
    public static void main(String[] args) {
        int  data = 231956327;
        String number = String.valueOf(data);
        for (int i = 0; i < number.length(); i++) {
            char  k = number.charAt(i);
            char num = k;
            switch (num) {
                case '1':
                    System.out.print("One  ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;

                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;

                case '6':
                    System.out.print("Six ");
                    break;

                case '7':
                    System.out.print("Seven ");
                    break;

                case '8':
                    System.out.print("Eight ");
                    break;

                case '9':
                    System.out.print("Nine ");
                    break;

                case '0':
                    System.out.print("zero ");
                    break;
            }
        }


    }

}
