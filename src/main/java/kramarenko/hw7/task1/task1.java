package kramarenko.hw7.task1;

public class task1 {

        public static void main(String[] args) {
            Student student = new Student("John", "Smith", "Group1", 4.6);
            Aspirant aspirant1 = new Aspirant("James", "Clarkson", "Group2", 4.0, "Work1");
            Student aspirant2 = new Aspirant("Richard", "Hammond", "Group3", 5, "Work2");
            Student[] students = {student, aspirant1,aspirant2};
            for (Student s: students) {
                System.out.println(s.getScholarship());
            }
        }
    }
}
