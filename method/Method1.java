package method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(1, 2);
        System.out.println("결과1 출력: " + sum1);

        System.out.println("=================");

        int sum2 = add(10, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드 (자바에서는 함수를 메서드라고 부름)
    public static int add(int a, int b) { // 여기서 void가 아닌 int는 int형으로 반환한다는 뜻임
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
