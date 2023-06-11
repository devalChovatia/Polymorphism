public class NonProfessionalEmployee extends Employee {
    private double hourlySalary;
    private int hoursWorkedYearly;
    private int hoursWorkedWeekly;

    public NonProfessionalEmployee(String name, int ssn, int age, String gender, String address, String phoneNumber, double hourlySalary,
                                   int hoursWorkedYearly, int hoursWorkedWeekly, String department, String jobTitle, int yearOfHire) {
        super(name, ssn, age, gender, address, phoneNumber, department, jobTitle, yearOfHire);
        this.hourlySalary = hourlySalary;
        this.hoursWorkedYearly = hoursWorkedYearly;
        this.hoursWorkedWeekly = hoursWorkedWeekly;
    }
    @Override
    public void weeklySalary() {
        double weeklySalary = (hourlySalary * hoursWorkedWeekly);
        System.out.print(" \t\tWeekly Salary: + " + weeklySalary);

    }

    @Override
    public void healthCareContributions() {
        double healthCareContributions = ((hourlySalary * hoursWorkedWeekly) * 52) * 0.28;
        System.out.print(" \t\tHealth Care Contributions: " + healthCareContributions);
    }

    @Override
    public void vacationDaysEarned() {
        int vacationDaysEarned = hoursWorkedYearly / 150;
        System.out.println(" \t\tVacation Days: " + vacationDaysEarned);
    }
}