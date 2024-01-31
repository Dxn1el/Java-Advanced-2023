import java.util.Collection;

public interface LoanRepository {
    void addLoan(BaseLoan loan);
    boolean removeLoan(BaseLoan loan);
    BaseLoan findFirst(String type);
}
