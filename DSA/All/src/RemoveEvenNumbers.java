public class RemoveEvenNumbers {
    public static void main(String[] args){

        int[] arr = {45, 13, 16, 50, 99, 23 };
        removeEvenNumber(arr);

    }

    public static void removeEvenNumber(int[] arr){


        for (int i = 0; i<arr.length; i++){
            if(arr[i] %2!=0){
                System.out.println(arr[i]);
            }
        }









    }
}
