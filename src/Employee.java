public class Employee extends Person {
    private String department;
    private String jobTitle;
    private int yearOfHire;

    public Employee(String name, int ssn, int age, String gender, String address, String phoneNumber, String department, String jobTitle, int yearOfHire) {
        super(name, ssn, age, gender, address, phoneNumber);
        this.department = department;
        this.jobTitle = jobTitle;
        this.yearOfHire = yearOfHire;

    }

    public void displayEmployee() {
        System.out.print(" Department: " + department + " \t\tJob Title: " + jobTitle
                + " \t\tYear of Hire: " + yearOfHire);
    }
    public void weeklySalary(){}

    public void healthCareContributions() {}

    public void vacationDaysEarned() {}
}