package edu.jsu.mcis;
import java.io.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CourseTest {
    private String courseId;
    private String courseTerm;
    private String courseYear;
    private String courseSize;
    private Course c;

    @Before
    public void setup() {
        c = new Course();
    }

    @Test
    public void testCourseIdFromFile() {
        assertEquals(c.getCourseId(), "99000");
    }

    @Test
    public void testCourseTermFromFIle() {
        assertEquals(c.getCourseTerm(), "Spring");
    }

    @Test
    public void testCourseYearFromFile() {
        assertEquals(c.getCourseYear(), "2013");
    }

    @Test
    public void testCourseSizeFromFile() {
        assertEquals(c.getCourseSize(), "11");
    }
}
