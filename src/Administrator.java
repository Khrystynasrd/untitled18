class Administrator extends Employee implements Workable, Service {
    private int hoursWorked;
    private double hourlyRate;

    public Administrator(String firstName, String lastName, int id, String department, int hoursWorked, double hourlyRate) {
        super(firstName, lastName, id, department, true);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void performDuties() {
        System.out.println(getFullName() + " is managing university administration.");
    }

    @Override
    public void isDuty() {
        System.out.println("Checking if " + getFullName() + " can perform military duty: " + (isMilitary() ? "Yes" : "No"));
    }

    private boolean isMilitary() {
        return true;
    }
}
