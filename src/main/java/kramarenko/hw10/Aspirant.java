package kramarenko.hw10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Aspirant {
    private Aspirant aspirant1;
    private Aspirant aspirant2;
    private Aspirant aspirant3;
    private Aspirant aspirant4;
    private Aspirant aspirant5;
    private Aspirant aspirant6;
    private Aspirant aspirant7;
    private Aspirant aspirant8;

    @BeforeEach
    void setUp() {
        aspirant1 = new Aspirant("", "", "", 4, "");
        aspirant2 = new Aspirant("", "", "", 5, "");
        aspirant3 = new Aspirant("", "", "", 1, "");
        aspirant4 = new Aspirant("", "", "", 0, "");
        aspirant5 = new Aspirant("", "", "", 5.1, "");
        aspirant6 = new Aspirant("", "", "", 4.9, "");
        aspirant7 = new Aspirant("", "", "", 5.0, "");
        aspirant8 = new Aspirant("", "", "", 0.5, "");
    }
    @Test
    void testGetScholarshipWithInteger() {
        Aspirant aspirant1 = new Aspirant("", "", "", 4, "");
        Aspirant aspirant2 = new Aspirant("", "", "", 5, "");
        Aspirant aspirant3 = new Aspirant("", "", "", 1, "");
        Aspirant aspirant4 = new Aspirant("", "", "", 0, "");
        Assertions.assertEquals(180, aspirant1.getScholarship());
        Assertions.assertEquals(200, aspirant2.getScholarship());
        Assertions.assertEquals(180, aspirant3.getScholarship());
        @ @ -20, 13 + 36, 9 @@void testGetScholarshipWithInteger () {

            @Test
            void testGetScholarshipWithDouble () {
                Aspirant aspirant1 = new Aspirant("", "", "", 5.1, "");
                Aspirant aspirant2 = new Aspirant("", "", "", 4.9, "");
                Aspirant aspirant3 = new Aspirant("", "", "", 5.0, "");
                Aspirant aspirant4 = new Aspirant("", "", "", 0.5, "");
                Assertions.assertEquals(180, aspirant1.getScholarship());
                Assertions.assertEquals(180, aspirant2.getScholarship());
                Assertions.assertEquals(200, aspirant3.getScholarship());
                Assertions.assertEquals(180, aspirant4.getScholarship());
                Assertions.assertEquals(180, aspirant5.getScholarship());
                Assertions.assertEquals(180, aspirant6.getScholarship());
                Assertions.assertEquals(200, aspirant7.getScholarship());
                Assertions.assertEquals(180, aspirant8.getScholarship());
            }
        }
    }
}