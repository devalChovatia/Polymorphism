public class SalariedEmployee extends Employee {
    private int annualSalary;

    public SalariedEmployee(String name, int ssn, int age, String gender, String address, String phoneNumber, int annualSalary, String department, String jobTitle, int yearOfHire) {
        super(name, ssn, age, gender, address, phoneNumber, department, jobTitle, yearOfHire);
        this.annualSalary = annualSalary;
    }

    public void displaySalariedEmployee() {
        System.out.print(" \t\tAnnual Salary: " + annualSalary);
    }
}