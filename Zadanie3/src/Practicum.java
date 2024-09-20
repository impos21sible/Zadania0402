public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000);
         // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdraw(500);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;
    private long newmoneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newmoneyAmount){
        this.moneyAmount = newmoneyAmount;
    }

    public void withdraw(long amount){
        if (amount <= moneyAmount){
            moneyAmount -= amount;
        }
        else {
            System.out.println("Недостаточно средств для снятия!");
        }
    }


}