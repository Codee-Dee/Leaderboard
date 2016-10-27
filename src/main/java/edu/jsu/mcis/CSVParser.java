package edu.jsu.mcis;
import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;


public class CSVParser {

	private List<Student> students;
	private List<Course> courses;
	private List<String> studentIds;
	private List<String> courseIds;
	private List<String> courseTerms;
	private File f;
	private String courseYear;
	public List<File> files;

	public CSVParser() {
		students = new ArrayList<>();
		studentIds = new ArrayList<>();
		courses = new ArrayList<>();
		courseIds = new ArrayList<>();
		courseTerms = new ArrayList<>();

		f = new File("/home/ben/Development/cs310/Leaderboard/src/main/resources/courses");
		
		try {
			CSVReader reader = new CSVReader(new FileReader("/home/ben/Development/cs310/Leaderboard/src/main/resources/students.csv"), ',', '\"', 1);
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				Student s = new Student(nextLine[0], nextLine[1], nextLine[2], nextLine[3]);
				students.add(s);
				studentIds.add(nextLine[0]);
			}
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}

		try {
			CSVReader reader = new CSVReader(new FileReader("/home/ben/Development/cs310/Leaderboard/src/main/resources/courses.csv"), ',', '\"', 1);
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				Course c = new Course(nextLine[0], nextLine[1], nextLine[2], nextLine[3]);
				String term = nextLine[1].toString();
				String year = nextLine[2].toString();
				courseYear = term + " " + year;
				courses.add(c);
				courseIds.add(nextLine[0]);
			}
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
	}

	public String getCourseYear(){
		return courseYear;
	}

	public String getStudentIds() {
		return String.join("\n", studentIds);
	}

	public List<String> getCourseIdsAsList() {
		return courseIds;
	}
	public String getCourseIds() {
		return String.join("\n", courseIds);
	}

	public Student getStudent(String studentId) {
		for(int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if(studentId.equals(s.getId())) return s;
		}
		return null;
    }
	
    public Course getCourse(String courseId) {
		for(int i = 0; i < courses.size(); i++){
			Course c = courses.get(i);
			if(courseId.equals(c.getId())) return c;
		}
		return null;
    }

	/*public String getCourseTerm(String courseId) {
		for(int i = 0; i < courses.size(); i++) {
			Course c = courses.get(i);
			if(courseId.equals(c.getId())) {
				String term = nextLine[1].toString();
				String year = nextLine[2].toString();
				String courseTerm = term+" "+year;
			}
		}
	}
*/

	//this returns each file directory in an array list as a string
	/*public List <File> getCourses(){
		return files;
	}*/
	
	
}
