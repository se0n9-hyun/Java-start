package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5; // main()도 사실 메서드임. 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 지역변수임.
        System.out.println("1. changeNumber 호출 전, num1: " + number);
        changeNumber(number); // 따라서 두 method에 있는 number는 다른 변수임
        System.out.println("4. changeNumber 호출 후, num1: " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, num2: " + number);
        number = number * 2;
        System.out.println("2. changeNumber 변경 후, num2: " + number);
    }
}
