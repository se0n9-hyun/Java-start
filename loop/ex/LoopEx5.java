package loop.ex;

public class LoopEx5 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // println과 달리 print는 터미널에서 자동으로 다음 줄에 출력되지 않고 붙어서 출력된다.
            }
            System.out.println();
        }
    }
}
