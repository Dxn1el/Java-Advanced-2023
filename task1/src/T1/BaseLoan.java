package T1;

public abstract class BaseLoan implements Loan {
    private int interestRate;
    private double amount;

    public BaseLoan(int interestRate, double amount) {
        this.interestRate = interestRate;
        this.amount = amount;
    }

    @Override
    public int getInterestRate() {
        return interestRate;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
