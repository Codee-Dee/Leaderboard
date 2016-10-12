package edu.jsu.mcis;
import java.io.*;
import java.util.*;
//import com.opencsv.*;
//import au.com.bytecode.opencsv.*;

public class Gamegogy {
    String type;
    String studentId;
    String studentData;
    String courseId;
    String courseData;
    

    public static void main(String[] args) throws Exception {
        for (String s: args) {
            if (s.equals("studentids")) {
                // THE BELOW NEEDS FULL PATH TO FILE. MUST FIX THIS TO TAKE RELATIVE PATH.
                FileReader file = new FileReader(new File("/home/ben/Development/cs310/Leaderboard/data/students.csv"));
                BufferedReader reader = new BufferedReader(file);
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line.split(",")[0]);
                }
            }
            else if (s.equals("courseids")) {
                // THE BELOW NEEDS FULL PATH TO FILE. MUST FIX THIS TO TAKE RELATIVE PATH.
                FileReader file = new FileReader(new File("/home/ben/Development/cs310/Leaderboard/data/courses.csv"));
                BufferedReader reader = new BufferedReader(file);
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line.split(",")[0]);
                }
            }
            else if (s.equals("student")) {
                // take student id
                // get student info from file
                // print student info
            }
            else if (s.equals("course")) {
                // take course id
                // get course info from file
                // print course info
            }
            else { System.exit(0); }
        }
    }
}
