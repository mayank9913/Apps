package easyQuestions;

public class RemoveSmallWordsInArrayOfString {
    public static void main(String[] args) {
        int count = 0;
        String[] array = {"A", "Quick", "Brown", "Fox", "Jump", "Over", "A", "Lazy", "Dog"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 3) {
                System.out.println(array[i]);

            }
        }
    }
}
