
public class Palindrome {
    public static void main(String[] args){
          String d = "";
          String a = "hannah";
        for(int i =a.length()-1; i>=0 ; i-- ) {

          d = d + a.charAt(i);
        }
        if(a.equals(d)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }



}

}
