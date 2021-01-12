public class MultipleSum {
    public static void main(String[] args){
     int limit = 10;
     int i = 0;
     int sum = 0;
     while(i <= limit){
         if (i % 3 == 0){
             sum = sum + i;
         }
         i++;

     }
        System.out.println(sum);
    }
}
