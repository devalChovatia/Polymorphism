public class ProfessionalEmployee extends Employee {
    private double monthlySalary;
    private int numberOfVacationDays;

    public ProfessionalEmployee(String name, int ssn, int age, String gender, String address, String phoneNumber, double monthlySalary,
                                int numberOfVacationDays, String department, String jobTitle, int yearOfHire) {
        super(name, ssn, age, gender, address, phoneNumber, department, jobTitle, yearOfHire);
        this.monthlySalary = monthlySalary;
        this.numberOfVacationDays = numberOfVacationDays;
    }

    @Override
    public void weeklySalary() {
        double weeklySalary = monthlySalary / 4;
        System.out.print(" \t\tWeekly Salary: + " + weeklySalary);
    }

    @Override
    public void healthCareContributions() {
        double healthCareContributions = (monthlySalary * 12) * 0.20;
        System.out.print(" \t\tHealth Care Contributions: " + healthCareContributions);
    }

    @Override
    public void vacationDaysEarned() {
        System.out.println(" \t\tVacation Days: " + numberOfVacationDays);
    }
}