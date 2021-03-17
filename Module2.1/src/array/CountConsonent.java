package array;

import java.util.Scanner;

public class CountConsonent {
    public static void main(String[] args){
        int count = 0;
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        for (int i=0; i<s.length(); i++){
         char k = s.charAt(i);
         switch (k){
             case 'a':
                 count++;
                 break;
             case 'A':
                 count++;
                 break;
             case 'e':
                 count++;
                 break;
             case 'E':
                 count++;
                 break;
                 case 'i':
                 count++;
                 break;
             case 'I':
                 count++;
                 break;
                 case 'o':
                 count++;
                 break;
             case 'O':
                 count++;
                 break;
                 case 'u':
                 count++;
                 break;
             case 'U':
                 count++;
                 break;


         }
        }
        int no = s.length() -count;
        System.out.println(no);


    }
}
