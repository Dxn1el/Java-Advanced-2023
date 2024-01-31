import java.util.Collection;

public interface BaseBank {
    String getName();
    int getCapacity();
    int sumOfInterestRates();
    void addClient(BaseClient client);
    void removeClient(BaseClient client);
    void addLoan(BaseLoan loan);
    String getStatistics();
}
