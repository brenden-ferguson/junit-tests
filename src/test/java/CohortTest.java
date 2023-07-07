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
    public void testAddStudent(){
        Student brenden = new Student(1,"Brenden");
        students.add(brenden);
        assertSame(brenden, students.get(0));
    }

    @Test
    public void testGetStudents(){
        Student brenden = new Student(1, "Brenden");
        Student rodney = new Student(2,"Rodney");
        students.add(brenden);
        students.add(rodney);
        students.get
    }

}
