package kramarenko.hw10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Student {

        private Student student1;
        private Student student2;
        private Student student3;
        private Student student4;
        private Student student5;
        private Student student6;
        private Student student7;
        private Student student8;

        @BeforeEach
        void setUp() {
            student1 = new Student("", "", "", 4);
            student2 = new Student("", "", "", 5);
            student3 = new Student("", "", "", 1);
            student4 = new Student("", "", "", 0);
            student5 = new Student("", "", "", 5.1);
            student6 = new Student("", "", "", 4.9);
            student7 = new Student("", "", "", 5.0);
            student8 = new Student("", "", "", 0.5);
        }

        @Test
        void testGetScholarshipWithInteger() {
            Student aspirant1 = new Student("", "", "", 4);
            Student aspirant2 = new Student("", "", "", 5);
            Student aspirant3 = new Student("", "", "", 1);
            Student aspirant4 = new Student("", "", "", 0);
            Assertions.assertEquals(80, aspirant1.getScholarship());
            Assertions.assertEquals(100, aspirant2.getScholarship());
            Assertions.assertEquals(80, aspirant3.getScholarship());
            Assertions.assertEquals(80, aspirant4.getScholarship());
            Assertions.assertEquals(80, student1.getScholarship());
            Assertions.assertEquals(100, student2.getScholarship());
            Assertions.assertEquals(80, student3.getScholarship());
            Assertions.assertEquals(80, student4.getScholarship());
        }

        @Test
        void testGetScholarshipWithDouble() {
            Student aspirant1 = new Student("", "", "", 5.1);
            Student aspirant2 = new Student("", "", "", 4.9);
            Student aspirant3 = new Student("", "", "", 5.0);
            Student aspirant4 = new Student("", "", "", 0.5);
            Assertions.assertEquals(80, aspirant1.getScholarship());
            Assertions.assertEquals(80, aspirant2.getScholarship());
            Assertions.assertEquals(100, aspirant3.getScholarship());
            Assertions.assertEquals(80, aspirant4.getScholarship());
            Assertions.assertEquals(80, student5.getScholarship());
            Assertions.assertEquals(80, student6.getScholarship());
            Assertions.assertEquals(100, student7.getScholarship());
            Assertions.assertEquals(80, student8.getScholarship());
        }
    }

