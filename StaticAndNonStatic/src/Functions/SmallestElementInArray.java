package Functions;

public class SmallestElementInArray {
    public static void main(String[] args){

        int[] arr = {10, 30, 150, 40, 5, 23 };
        minimumValueCount(arr);

    }

    public static void minimumValueCount(int[] arr){
        int minimumValue = arr[0];


        for (int i = 0; i<arr.length; i++){
            if (arr[i] < minimumValue){
                minimumValue = arr[i];
            } else if
            (arr[i] == minimumValue){
            }

        }
        System.out.println("  minimum value is  " + minimumValue);
    }

}