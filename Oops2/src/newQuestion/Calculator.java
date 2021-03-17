package newQuestion;

public class Calculator {


    public int add(int a, int b){
        System.out.println("addition "+(a+b));
        return a+b;
    }


    public double add(double a, double b){
        System.out.println("addition "+(a+b));
        return a+b;
    }

    public  void calculatearea(int length, double breath){
        double area = length*breath;
        System.out.println(area);

    }
}
