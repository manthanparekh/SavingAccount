public class SavingAccount {
    int savings_balance;
    int deposit;
    int withdraw;
    int check_balance;

    public static void main(String[] args) {
        SavingAccount Current = new SavingAccount();
        SavingAccount Total = new SavingAccount();

        Current.savings_balance = 2000;
        Total.deposit = 600;
        Total.withdraw = 300;
        Current.check_balance = (2000 + 600 - 300) ;

        System.out.println("Welcome to your Savings Account!");
        System.out.println("Intial Balance: " + "$" + Current.savings_balance);
        System.out.println("Deposit Amount: " + "$" + Total.deposit);
        System.out.println("Withdrawal Amount: " + "$" + Total.withdraw);
        System.out.println("Overall Balance: " + "$" + Current.check_balance);

    }

}
