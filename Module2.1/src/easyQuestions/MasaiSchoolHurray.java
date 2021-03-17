package easyQuestions;

import java.util.Scanner;

public class MasaiSchoolHurray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if(n%35==0){
           System.out.println("Masai School");
       }else if(n%5==0){
           System.out.println("School");
       }else if(n%7==0){
           System.out.println("Masai");
       }else {
           System.out.println("Hurray!");
       }

}

}
