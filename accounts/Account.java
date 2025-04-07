package accounts;

public abstract class Account {
    protected long balance = 0;

    public boolean add(long amount) {
        if (amount <= 0)
            return false;
        balance += amount;
        return true;
    }

    public boolean pay(long amount) {
        if (amount <= 0)
            return false;
        if (balance < amount)
            return false;
        balance -= amount;
        return true;
    }

    public boolean transfer(Account account, long amount) {
        if (balance < amount)
            return false;
        balance -= amount;
        account.balance += amount;
        return true;
    }

    public long getBalance() {
        return balance;
    }

}
