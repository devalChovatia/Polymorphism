public class HourlyEmployee extends Employee {
    private double rate;
    private int hoursWorked;
    private double unionDues;

    public HourlyEmployee(String name, int ssn, int age, String gender, String address, String phoneNumber, double rate, int hoursWorked, double unionDues, String department, String jobTitle, int yearOfHire) {
        super(name, ssn, age, gender, address, phoneNumber, department, jobTitle, yearOfHire);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.unionDues = unionDues;
    }

    public void displayHourlyEmployee() {
        System.out.print(" \t\tRate: " + rate + " \t\tHours Worked: " + hoursWorked +
                " \t\tUnion Dues: " + unionDues + "\n");
    }
}