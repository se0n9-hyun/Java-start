package operator;

public class OperatorLogical1 {
    public static void main(String[] args) {
        // AND 연산
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // OR 연산
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // ! 연산
        System.out.println(!true);
        System.out.println(!false);

        // 변수 활용
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
