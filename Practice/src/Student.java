
public class Student {
	private static int StudentID;
	private static String StudentName;
	private static float marks;
	private static boolean secondChance;
	    
	public Student(int id, String name, boolean S) {
		Student.StudentID = id;
		Student.StudentName = name;
		Student.secondChance = false;
		
	}
	
	public static void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public static void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public static void setMarks(float marks) {
		Student.marks = marks;
	}

	public static boolean isSecondChance() {
		return secondChance;
	}

	public static void setSecondChance(boolean secondChance) {
		Student.secondChance = secondChance;
	}
}
