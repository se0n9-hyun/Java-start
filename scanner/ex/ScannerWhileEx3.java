package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세. 입력을 중단하려면 -1을 입력하세요: ");
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        int i = 0;

        /*
        while (true) {
            int num = input.nextInt();

            if (num == -1) {
                break;
            }

            sum += num;
            i++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + (double) sum / i);
         */

        while ((num = input.nextInt()) != -1) { // 앞에서 num 선언 -> while 조건문에서 변수 num에 할당
            sum += num;
            i++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + (double) sum / i); // 형변환을 안 하면 소수점 날아감
    }
}