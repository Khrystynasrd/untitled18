public class Main {
    public static void main(String[] args) {
        Administrator administrator = new Administrator("Anna", "Pavlova", 1, "Facultet CZ", 8, 100);
        Professor professor = new Professor("Yulia", "Nazar", 2, "ITTS", 4, 200);

        System.out.println("Administrator's Salary: " + administrator.calculateSalary());
        System.out.println("Professor's Salary: " + professor.calculateSalary());

        administrator.performDuties();
        administrator.isDuty();

        professor.performDuties();
        professor.isDuty();
    }
}