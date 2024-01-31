import java.util.ArrayList;
import java.util.Collection;

public class BranchBank implements BaseBank {
    // Implement the BranchBank class based on the description in Task 1.
    private final String name;
    private final int capacity;
    private final Collection<BaseLoan> loans;
    private final Collection<BaseClient> clients;

    public BranchBank(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Bank name cannot be null or empty.");
        }
        this.name = name;
        this.capacity = 25;
        this.loans = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int sumOfInterestRates() {
        int sum = 0;
        for (BaseLoan loan : loans) {
            sum += loan.getInterestRate();
        }
        return sum;
    }

    @Override
    public void addClient(BaseClient client) {
        if (clients.size() >= capacity) {
            throw new IllegalStateException("Not enough capacity for this client.");
        }
        clients.add(client);
    }

    @Override
    public void removeClient(BaseClient client) {
        clients.remove(client);
    }

    @Override
    public void addLoan(BaseLoan loan) {
        loans.add(loan);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append(", Type: ").append("BranchBank").append("\n");
        sb.append("Clients: ");
        if (clients.isEmpty()) {
            sb.append("none");
        } else {
            for (BaseClient client : clients) {
                sb.append(client.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2); // Remove last ", "
        }
        sb.append(" / Clients: none\n");
        sb.append("Loans: ").append(loans.size()).append(", Sum of interest rates: ").append(sumOfInterestRates());
        return sb.toString();
    }
}
