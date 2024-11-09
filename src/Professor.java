class Professor extends Employee implements Workable, Service {
    private int numberOfLectures;
    private double ratePerLecture;

    public Professor(String firstName, String lastName, int id, String department, int numberOfLectures, double ratePerLecture) {
        super(firstName, lastName, id, department, false);
        this.numberOfLectures = numberOfLectures;
        this.ratePerLecture = ratePerLecture;
    }

    @Override
    public double calculateSalary() {
        return numberOfLectures * ratePerLecture;
    }

    @Override
    public void performDuties() {
        System.out.println(getFullName() + " is teaching " + numberOfLectures + " lectures.");
    }

    @Override
    public void isDuty() {
        System.out.println("Checking if " + getFullName() + " can perform military duty: " + (isMilitary() ? "Yes" : "No"));
    }

    private boolean isMilitary() {
        return false;
    }
}