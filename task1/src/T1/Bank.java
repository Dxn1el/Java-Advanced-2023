package T1;

public interface Bank {
    String getName();
    int getCapacity();
    int sumOfInterestRates();
    void addClient(Client client);
    void removeClient(Client client);
    void addLoan(Loan loan);
    String getStatistics();
}