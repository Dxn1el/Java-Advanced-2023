public class Student implements BaseClient {
    // Implement the Student class based on the description in Task 1.
    private static final int INITIAL_INTEREST = 2;
    private final String name;
    private final String ID;
    private int interest;
    private double income;

    public Student(String name, String ID, double income) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Client name cannot be null or empty.");
        }
        if (ID == null || ID.trim().isEmpty()) {
            throw new IllegalArgumentException("Client's ID cannot be null or empty.");
        }
        if (income <= 0) {
            throw new IllegalArgumentException("Client income cannot be below or equal to 0.");
        }

        this.name = name;
        this.ID = ID;
        this.income = income;
        this.interest = INITIAL_INTEREST;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public int getInterest() {
        return interest;
    }

    @Override
    public double getIncome() {
        return income;
    }

    @Override
    public void increase() {
        interest += 1;
    }
}
