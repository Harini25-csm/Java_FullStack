package Oops.InterfaceCodes;

class RunnerPF implements Flipkart {
    @Override
    public void pay(int amount) {
        System.out.println("Paid amount: " + amount);
    }

    @Override
    public void order(String product) {
        System.out.println("Ordered product: " + product);
    }

    public static void main(String[] args) {
        RunnerPF runner = new RunnerPF();
        runner.order("Mobile phone");
        runner.pay(20000);
    }
}
