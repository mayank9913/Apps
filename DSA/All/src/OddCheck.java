public class OddCheck {

    public static void main(String[] args){
        int a = 25;
        for(int i = 1; i<a; i ++){
            boolean check = oddCheck(a);

        }

    }
 private  static  boolean oddCheck(int i ){
        if (i%2!=0){
            //System.out.println("true");
          return true;

        }

        return  false;
 }
}
