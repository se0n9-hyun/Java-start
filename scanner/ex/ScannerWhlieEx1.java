package scanner.ex;

import java.util.Scanner;

public class ScannerWhlieEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            // 터미널에서 20 enter를 치면 .nextLine과 달리 .nextInt는 20\n 에서 20만 가지고 가서 while문이 돌 때 다음 .nextLine에 \n이 자동으로 입력됨 -> 아래의 코드를 쳐서 라인을 한 번 읽어주고 버리면 된다.
            input.nextLine();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
