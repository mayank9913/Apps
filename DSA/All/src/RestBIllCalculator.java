public class RestBIllCalculator {
    public static void main(String[] args){
        int item1 = 80;
        int item2 = 140;
        int quant1 = 6;
        int quant2 = 3;
        int tax = 5;

        int discout = 8;
        int tip = 50;
        double bill = (item1*quant1 + item2*quant2)*105/100;
        double AmountToPay = (bill- bill*8/100) + tip;
        System.out.println(AmountToPay);



    }
}
