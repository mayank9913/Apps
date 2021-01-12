public class CouponDiscountCalculator {
    public static void main(String[] args){
        int saleAmounnt = 1500;
        int coupon =  10*saleAmounnt/100;
        if(coupon>100){
            coupon= 100;
        }
        int amountPay = saleAmounnt - coupon;
        System.out.println(amountPay);

    }
}
