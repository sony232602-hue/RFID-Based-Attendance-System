import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AttendanceSystemTest {

    private AttendanceSystem system;

    @BeforeEach
    public void setup() {

        system = new AttendanceSystem();

        system.registerStudent(
            new Student(
                "A1B2C3D4",
                "23EC001",
                "Rahul",
                "ECE"
            )
        );
    }

    @Test
    public void testStudentRegistration() {

        Student student =
            system.findStudent(
                "A1B2C3D4"
            );

        assertNotNull(student);

        assertEquals(
            "Rahul",
            student.getName()
        );
    }

    @Test
    public void testValidRFID() {

        assertTrue(
            system.markAttendance(
                "A1B2C3D4"
            )
        );
    }

    @Test
    public void testInvalidRFID() {

        assertFalse(
            system.markAttendance(
                "UNKNOWN123"
            )
        );
    }

    @Test
    public void testDuplicateAttendance() {

        assertTrue(
            system.markAttendance(
                "A1B2C3D4"
            )
        );

        assertFalse(
            system.markAttendance(
                "A1B2C3D4"
            )
        );
    }

    @Test
    public void testAttendanceCount() {

        system.markAttendance(
            "A1B2C3D4"
        );

        assertEquals(
            1,
            system.getAttendanceCount()
        );
    }
}
