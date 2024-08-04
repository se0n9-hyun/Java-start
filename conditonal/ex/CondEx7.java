package conditional.ex;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 3;
        String Ood_Even = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + Ood_Even);
    }
}
