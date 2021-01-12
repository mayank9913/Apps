public class CompareNumbers {

    public static void main(String[] args){
        int a = 20;
        int b = 40;
        if(a == b){
            System.out.println("A=B");
        } else{
            String compare = (a<b)?"A<B" :"B<A" ;
            System.out.println(compare);
        }



    }
}
