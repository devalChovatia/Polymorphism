public class Student extends Person {
    private double gpa;
    private String major;
    private int yearOfGraduation;

    public Student(String name, int ssn, int age, String gender, String address, String phoneNumber, double gpa, String major, int yearOfGraduation) {
        super(name, ssn, age, gender, address, phoneNumber);
        this.gpa = gpa;
        this.major = major;
        this.yearOfGraduation = yearOfGraduation;
    }

    public void displayStudent() {
        System.out.println(" GPA: " + gpa + " \t\tMajor: " + major + " \t\tYear of Graduation: " + yearOfGraduation);
    }



    public int exam(String exam1, String exam2, String exam3) {
        int numOfQuestions;
        int mcQuestions = 20;
        numOfQuestions = 3 * mcQuestions;
        System.out.println("The number of questions: " + numOfQuestions);
        return numOfQuestions;
    }

    public int exam(String exam1, String exam2) {
        int numOfQuestions;
        int mcQuestions = 20;
        numOfQuestions = 2 * mcQuestions;
        System.out.println("The number of questions: " + numOfQuestions);
        return numOfQuestions;
    }
}
