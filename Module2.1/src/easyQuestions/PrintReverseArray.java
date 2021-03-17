package easyQuestions;

public class PrintReverseArray {
    public static  void main(String[] args){

        int[] array = {2, 5, 8, 1, 4};
        for(int i= array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
        String[] array2 = {"A", "E", "I", "O", "U"};
        for(int i= array2.length-1; i>=0; i--){
            System.out.println(array2[i]);
        }


    }
}
