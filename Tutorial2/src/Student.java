
public class Student extends Node{//StudentŬ������ Node Ŭ�������� ����� �޴´�.
	
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
		super(name, age, height, weight);//�θ� Ŭ������ �����ڸ� �����ϰڴٴ� ��.
		this.stdID = stdID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("***************student********************");
		System.out.println("�л� �̸� : "+ getName());
		System.out.println("�л� ���� : "+ getAge());
		System.out.println("�л� Ű : "+ getHeight());
		System.out.println("�л� ������ : "+ getWeight());
		System.out.println("�л� �й� : "+ getStdID());
		System.out.println("�л� �г� : "+ getGrade());
		System.out.println("�л� ���� : "+ getGPA());
	}
}






















