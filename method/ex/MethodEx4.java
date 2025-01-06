package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");

            int option = input.nextInt();
            int amount;

            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = input.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = input.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break; // break는 가장 가까운 반복 또는 switch문을 빠져나가게 한다.
                case 4:
                    System.out.println("시스템 종료합니다.");
                    return; // main 메서드 종료 -> switch문을 빠져나가는 break와 달리 main 메서드 전체를 종료시킴
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}