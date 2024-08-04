package conditional;

public class If3 {
    public static void main(String[] args) {
        // if-else문을 사용하지 않는 경우 -> 독립된 if

        int price = 10000;
        int age = 9;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: "+ discount + "원");
    }
}
