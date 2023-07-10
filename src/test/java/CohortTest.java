import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    private List<Student> students;
    //A Cohort instance can add a Student to the List of students.
    @Before
    public void setUp() {
        this.students = new ArrayList<>();
    }

    @Test
    public void testAddStudent() {
        // Create a cohort instance
        Cohort cohort = new Cohort();

        // Create a sample student
        Student student1 = new Student(1,"John Doe");

        // Add the student to the cohort
        cohort.addStudent(student1);

        // Retrieve the list of students from the cohort
        List<Student> students = cohort.getStudents();

        // Assert that the list contains the added student
        assertEquals(1, students.size());
        assertTrue(students.contains(student1));
    }

//    A Cohort instance can get the current List of students.
    @Test
    public void testGetStudents() {
        // Create a cohort instance
        Cohort cohort = new Cohort();

        // Create some sample students
        Student student1 = new Student(1,"John");
        Student student2 = new Student(2,"Jane");

        // Add the students to the cohort
        cohort.addStudent(student1);
        cohort.addStudent(student2);

        // Retrieve the list of students from the cohort
        List<Student> students = cohort.getStudents();

        // Assert that the list contains the expected number of students
        assertEquals(2, students.size());

        // Assert that the list contains the expected students
        assertTrue(students.contains(student1));
        assertTrue(students.contains(student2));
    }

//    A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testAverage(){
        Cohort cohort = new Cohort();
        Student student1 = new Student(1,"John");
        Student student2 = new Student(2,"Jane");
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        student1.addGrade(98);
        student2.addGrade(76);
        cohort.getCohortAverage();
    }

}
