public class MinimumValue {
    public static void main(String[] args){

        int[] arr = {45, 13, 16, 50, 99, 23 };
        minimumValueCount(arr);

    }

        public static void minimumValueCount(int[] arr){
            int minimumValue = arr[0];
            int count = 0;


            for (int i = 0; i<arr.length; i++){
                if (arr[i] < minimumValue){
                    minimumValue = arr[i];
                    count = 1;
                } else if
                    (arr[i] == minimumValue){
                        count++;
                    }

            }
            System.out.println("  minimum value  " + minimumValue+ "  Ocurrs  " + count);
    }

    }
