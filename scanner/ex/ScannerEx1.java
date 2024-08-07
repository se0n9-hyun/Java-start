package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("당신을 이름을 입력하세요: ");
        String name = input.nextLine();
        System.out.print("당신을 나이을 입력하세요: ");
        String age = input.nextLine();

        System.out.println("당신의 이름은 " + name + "이고, " + "나이는 " + age + "입니다.");



    }
}
