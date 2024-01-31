public class MortgageLoan implements BaseLoan {
    private final int interestRate = 3;
    private final double amount = 50000.0;

    @Override
    public int getInterestRate() {
        return interestRate;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}