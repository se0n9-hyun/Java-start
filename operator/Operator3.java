package operator;

public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 +2) * 3;
        System.out.println("sum1 = " + sum1); // soutv 사용
        System.out.println("sum2 = " + sum2);
        // (2 * 2) + (3 * 3)과 같이 괄호를 명시적으로 사용하는 것 더 명확하고 이해하기 쉽다. + 유지보수에 유리
    }
}
