public class Consonants {
    public static void main(String[] args) {
        String[] name = {"abc", "cde"};
        int count = 0;
        for (int i = 0; i < name.length; i++) {

            for (int j = 0; j < name[i].length(); j++) {

                switch (name[i].charAt(j)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    break;
                default:
                    count++;
                    break;}

            }
        }
        System.out.println(count);
    }


}