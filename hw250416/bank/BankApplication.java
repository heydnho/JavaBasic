package bank;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ac = true;

        while (ac) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            switch (selectNo) {
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> ac = false;
            }
        }

        System.out.println("프로그램 종료");
    }

    // 계좌 생성
    private static void createAccount() {
        System.out.print("계좌번호: ");
        String acNo = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(acNo, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록
    private static void accountList() {
        for (Account account : accountArray) {
            if (account != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAcNo(), account.getOwner(), account.getBalance());
            }
        }
    }

    // 예금
    private static void deposit() {
        System.out.print("계좌번호: ");
        String acNo = scanner.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(acNo);
        if (account != null) {
            account.setBalance(account.getBalance() + money);
            System.out.println("결과: 예금이 성공되었습니다.");
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    // 출금
    private static void withdraw() {
        System.out.print("계좌번호: ");
        String acNo = scanner.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(acNo);
        if (account != null) {
            if (account.getBalance() >= money) {
                account.setBalance(account.getBalance() - money);
                System.out.println("결과: 출금이 성공되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    // 계좌 찾기
    private static Account findAccount(String acNo) {
        for (Account account : accountArray) {
            if (account != null && account.getAcNo().equals(acNo)) {
                return account;
            }
        }
        return null;
    }
}