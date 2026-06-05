package Oops.Abstraction;

abstract class Atm {
    abstract void deposit(int money); // abstract method
    abstract void withdraw(int money);

    public static void main(String[] args) {
        Atm p = new AtmImple();
        p.deposit(500);
        p.withdraw(200);
    }
}

class AtmImple extends Atm {
    int bal=600;
    @Override
    void deposit(int money) {
        bal=bal+money;
        System.out.println("Deposited amount: " + bal);
    }

    @Override
    void withdraw(int money) {
        bal=bal-money;
        System.out.println("Withdraw amount: " + bal);
    }
}

