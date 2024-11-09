abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private String department;
    private boolean isMilitary;

    public Employee(String firstName, String lastName, int id, String department, boolean isMilitary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.isMilitary = isMilitary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public abstract double calculateSalary();
}

interface Workable {
    void performDuties();
}

interface Service {
    void isDuty();
}
