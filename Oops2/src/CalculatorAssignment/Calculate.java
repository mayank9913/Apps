package CalculatorAssignment;

public class Calculate {

    public static void sumFunction(float a, int b) {
        float ans= a+b;
        System.out.println("The Additiion "+a+"+"+b+ " is " +(int)ans);
    }
    public static void subtractFunction(float a, int b) {
        float ans = a- b;
        System.out.println("The Subtraction "+a+"-"+b+ " is " +(int)ans);
    }
    public static void multiplyFunction(float a, int b) {
        float ans = a*b;
        System.out.println("The multiplication "+a+"*"+b+ " is " +(int)ans);
    }

    public static void divideFunction(float a, int b) {
        float ans = a/b;
        System.out.println("The Division "+a+"/"+b+ " is " +(int)ans);
    }

}
