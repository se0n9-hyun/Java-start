package operator;

public class OperatorAdd {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a;
        /*
        a = a + 1;
        b = a;
        와 같다.
         */
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++;
        /*
        b = a;
        a = a + 1;
        와 같다.
         */
        System.out.println("a = " + a + ", b = " + b);
    }
}
