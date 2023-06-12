public abstract class Person {

    private String name;
    private int ssn;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public Person(String name, int ssn, int age, String gender, String address, String phoneNumber) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayGeneralInfo() {
        System.out.println("\n\n Name: " + name + " \t\tSSN: " + ssn + " \t\tAge: " + age +
                " \t\tGender: " + gender + " \t\tAddress: " + address + " \t\tPhone Number: " + phoneNumber);
    }
}
