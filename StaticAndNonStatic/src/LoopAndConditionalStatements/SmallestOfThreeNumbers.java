package LoopAndConditionalStatements;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 2;
        if(a<b && a<c && b<c){
            System.out.println(a);
        }else if(b<c && b<a && c<a){
            System.out.println(b);

        }else if(c<a && c<b && a<b){
            System.out.println(c);
        }

    }
}
