package variable;

public class Var2 {
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리 -> true, false 두 가지만 대입 가능
        char d = 'A'; // 문자 하나만 대입 가능
        String e = "Hello Java"; // 문자열 // String의 S는 대문자여야 한다
        // 위 코드에서 a, b, c 등은 변수이고, 우리가 직접 적은 100, 10.5, true 등은 리터럴(literal)이라고 한다.
        // 따라서 변수의 값은 변할 수 있지만, 리터럴 자체는 변하지 않는다.
        System.out.println(a);
        System.out.println(b); // command + d 를 누르면 다음 줄에 코드를 복사 붙여넣기를 한 번에 할 수 있다.
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
