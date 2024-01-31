public class StudentLoan implements BaseLoan {
    private final int interestRate = 1;
    private final double amount = 10000.0;

    @Override
    public int getInterestRate() {
        return interestRate;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}