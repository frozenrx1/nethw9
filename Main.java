import accounts.Account;
import accounts.CreditAccount;
import accounts.SimpleAccount;

public class Main {
    public static void main(String[] args) {
        Account simple = new SimpleAccount();
        Account credit = new CreditAccount(40000);
        simple.add(30000);
        credit.pay(20000);
        credit.pay(10000);
        credit.add(10000);
        simple.pay(20000);
        credit.transfer(simple, 20000);
        simple.transfer(credit, 20000);
        System.out.println("Кредитка: " + credit.getBalance() + "\nДебетовая: " + simple.getBalance());

        Logger simpleLog = new SimpleLogger();
        Logger smartLog = new SmartLogger();
        simpleLog.log("coolstorybob");
        smartLog.log("coolstorybob");
        smartLog.log("eRrOr");


    }
}