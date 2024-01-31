import java.util.ArrayList;
import java.util.Collection;

public class LoanRepositoryImpl implements LoanRepository {
    private final Collection<BaseLoan> loans;

    public LoanRepositoryImpl() {
        this.loans = new ArrayList<>();
    }

    @Override
    public void addLoan(BaseLoan loan) {
        loans.add(loan);
    }

    @Override
    public boolean removeLoan(BaseLoan loan) {
        return loans.remove(loan);
    }

    @Override
    public BaseLoan findFirst(String type) {
        for (BaseLoan loan : loans) {
            if (loan.getClass().getSimpleName().equals(type)) {
                return loan;
            }
        }
        return null;
    }
}
