package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
    }

    public static void changeNumber(int num2) { // 앞에서 num2을 선언하지 않아도, 이렇게 메서드의 parameter에서 선언하여 메서드 본문 안에서 사용할 수 있음
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("2. changeNumber 변경 후, num2: " + num2);
    }
}
