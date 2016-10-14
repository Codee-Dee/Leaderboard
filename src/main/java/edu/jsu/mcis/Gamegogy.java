package edu.jsu.mcis;
import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class Gamegogy {
    public Gamegogy() {
        //DataSource d = new DataSource();
    }

    public static void main(String[] args) throws Exception {
        CSVParser parser = new CSVParser();
        Student s = new Student("","","","");
        Course c = new Course("","","","");
        String studentId = "";
        String courseId = "";
        //String bar = "";

        for (String arg : args) {
            if (arg.equals("studentids")) {
                parser.studentParser();
            }
            else if (arg.equals("courseids")) {
                parser.courseParser();
            }
            else if (arg.equals("student")) {
                args[1] = studentId;
                parser.studentLine(studentId);
            }
            else if (arg.equals("course")) {
                args[1] = courseId;
                parser.courseLine(courseId);
            }
            else {System.exit(0);}
        }
    }
}
