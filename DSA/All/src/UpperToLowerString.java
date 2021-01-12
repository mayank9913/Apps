public class UpperToLowerString {


    public static void main(String[] args) {
        String ch = "MASAI";
        for(int i = 0; i<ch.length(); i++){
            int up = ch.charAt(i);
            if(up >64&&up<91){
                up = up + 32;
                System.out.println((char)up);
            }
            else if (up>64&&up<123){
                    System.out.println((char)up);{
                        if (up==32);
                        System.out.println(" ");
                    }
                }
            }
        }



    }
