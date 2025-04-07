package accounts;

public class CreditAccount extends Account {
    private final long limit;

    public CreditAccount(long limit) {
        this.limit = limit;
    }


    @Override
    public boolean add(long amount) {
        if (amount <= 0)
            return false;
        balance += amount;
        if (balance > 0)
            balance = 0;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount < -limit)
            return false;
        if (amount <= 0)
            return false;
        balance -= amount;
        return true;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (balance - amount < -limit)
            return false;
        balance -= amount;
        account.balance += amount;
        return true;
    }
}
