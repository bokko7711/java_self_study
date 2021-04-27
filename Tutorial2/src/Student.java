
public class Student extends Node{//Student클래스는 Node 클래스에서 상속을 받는다.
	
	private String stdID;
	private int  grade;
	private double GPA;
	
	public String getStdID() {
		return stdID;
	}
	public void setStdID(String stdID) {
		this.stdID = stdID;
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
	public Student(String name, int age, int height, int weight, String stdID, int grade, double gPA) {
		super(name, age, height, weight);//부모 클래스의 생성자를 실행하겠다는 뜻.
		this.stdID = stdID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("***************student********************");
		System.out.println("학생 이름 : "+ getName());
		System.out.println("학생 나이 : "+ getAge());
		System.out.println("학생 키 : "+ getHeight());
		System.out.println("학생 몸무게 : "+ getWeight());
		System.out.println("학생 학번 : "+ getStdID());
		System.out.println("학생 학년 : "+ getGrade());
		System.out.println("학생 성적 : "+ getGPA());
	}
}






















