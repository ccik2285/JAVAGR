package classStudy2;

public class Student extends Person{
	
	private String StudentID;
	private int grade;
	private double GPA;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		StudentID = studentID;
		this.grade = grade;
		this.GPA = gPA;
	}
	public void show() {
		System.out.println("name : " + this.getName());
		System.out.println("age : " + this.getAge());
		System.out.println("grage : " + this.getGrade());
		System.out.println("height : " + this.getHeight());
		System.out.println("weight : " + this.getWeight());
		System.out.println("id : " + this.getStudentID());
		
	}
	
}
