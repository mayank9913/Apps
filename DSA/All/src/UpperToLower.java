public class UpperToLower {
    public static void main(String[] args){
        char ch = 'Z';
        convertToUpperCase(ch);

    }


        public static  void convertToUpperCase(char upper){
        if (upper >= 65  && upper <=90){

           upper = (char) (upper + 32);
             System.out.println(upper);

            }
           else{
            System.out.println("not a upper case");
             }
}

}
