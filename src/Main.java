public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[5];

        Person student = new Student("John Lennon", 34223443, 23, "Male", "63 Moiron St",
                "6479238377", 3.4, "Electrical Engineer", 2019);

        Person hourlyEmployee = new HourlyEmployee("Lionel Messi", 63728263, 32, "Male", "180 Bellwyrm Ave",
                "4169286309", 23.75, 2400, 1800, "Law", "Criminal Lawyer", 2013);

        Person salariedEmployee = new SalariedEmployee("Sandy", 95467490, 47, "Female", "9210 Underwater rd",
                "9057216723", 100800, "Water", "Water Drinker", 2017);

        Employee professionalEmployee = new ProfessionalEmployee("Patrick Star", 73674634, 44, "Male", "43 Pumpkin Avenue",
                "6478937938", 10800, 30, "Arts", "Chef", 1999);

        Employee nonprofessionalEmployee = new NonProfessionalEmployee("Sarah Monroe", 83723711, 23, "Female", "9023 McMurphy Ave.",
                "9057265390", 23.75, 2440, 40, "Math", "Professor", 2020);


        people[0] = student;
        people[1] = hourlyEmployee;
        people[2] = salariedEmployee;
        people[3] = professionalEmployee;
        people[4] = nonprofessionalEmployee;

        for (int i = 0; i < 5; i++) {
            people[i].displayGeneralInfo();
            if (people[i] instanceof Student) ((Student) people[i]).displayStudent();
            if (people[i] instanceof Student) ((Student) people[i]).exam("History", "Calculus");
            if (people[i] instanceof Student) ((Student) people[i]).exam("History", "Calculus", "Chemistry");
            if (people[i] instanceof Employee) ((Employee) people[i]).displayEmployee();
            if (people[i] instanceof HourlyEmployee) ((HourlyEmployee) people[i]).displayHourlyEmployee();
            if (people[i] instanceof SalariedEmployee) ((SalariedEmployee) people[i]).displaySalariedEmployee();
            if (people[i] instanceof  NonProfessionalEmployee) ((NonProfessionalEmployee) people[i]).weeklySalary();
            if (people[i] instanceof  NonProfessionalEmployee) ((NonProfessionalEmployee) people[i]).healthCareContributions();
            if (people[i] instanceof  NonProfessionalEmployee) ((NonProfessionalEmployee) people[i]).vacationDaysEarned();
            if (people[i] instanceof  ProfessionalEmployee) ((ProfessionalEmployee) people[i]).weeklySalary();
            if (people[i] instanceof  ProfessionalEmployee) ((ProfessionalEmployee) people[i]).healthCareContributions();
            if (people[i] instanceof  ProfessionalEmployee) ((ProfessionalEmployee) people[i]).vacationDaysEarned();
        }
    }
}
