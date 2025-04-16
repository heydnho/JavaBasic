package bank;

public class Account {
    private String acNo;     // 계좌번호
    private String owner;   // 예금주
    private int balance;    // 잔액

    public Account(String acNo, String owner, int balance) {
        this.acNo = acNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAcNo() {
        return acNo;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
