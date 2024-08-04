package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int mul = a * b;
        System.out.println("a * b = " + mul);

        // 나눗셈
        int div = a / b; // 5 / 2 -> 2.5 하지만 a,b 모두 int형이기 때문에 계산 결과도 int형으로 출력되 소수점을 버린 2로 출력된다.
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
