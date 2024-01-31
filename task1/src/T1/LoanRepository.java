package T1;

public interface LoanRepository {
    void addLoan(Loan loan);
    boolean removeLoan(Loan loan);
    Loan findFirst(String type);
}}
