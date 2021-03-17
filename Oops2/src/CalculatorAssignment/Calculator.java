package CalculatorAssignment;

import java.util.Scanner;

import static CalculatorAssignment.Calculate.sumFunction;

public class Calculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Value ");
        float a  = sc.nextFloat() ;
        System.out.println("Enter The second Value");
        int b = sc.nextInt() ;
        System.out.println("Enter the operater");
        String s = sc.next();
        String operator = s;

        switch (operator){
            case "+":
                Calculate calculate = new Calculate();
               calculate.sumFunction(a, b);
                break;

            case "-":
                Calculate calculate2 = new Calculate();
                calculate2.subtractFunction(a, b);
                break;

            case "*":
                Calculate calculate3 = new Calculate();
                calculate3.multiplyFunction(a, b);
                break;

            case "/":
                Calculate calculate4 = new Calculate();
                calculate4.divideFunction(a, b);
                break;


        }

    }

}
