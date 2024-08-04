package operator;

public class OperatorComp2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        boolean result1 = "Hello".equals("Hello"); // 리터럴과 리터럴 비교
        boolean result2 = str1.equals("Hello"); // 문자열 변수와 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수와 문자열 변수 비

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("Hello" == "Hello"); // 특정 상황에 true가 안 나올 때가 있기 때문에 이런식의 코드는 작성하지 않도록 한다.
    }
}
