package enumeration.ex3;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == Grade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 20;
        } else {
            System.out.println("할인X");
        }

        //10000 * (20 / 100) -> 2000
        return price * discountPercent / 100;
    }
}