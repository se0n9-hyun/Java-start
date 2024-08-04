package conditional;

public class CondOperator1 {
    public static void main(String[] args) {
        // 단순한 참과 거짓에 따라 특정 값을 구하는 경우 if문 대신 삼항 연산자를 사용할 수 있다.
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age: " + age + ", status: " +  status);
    }
}
