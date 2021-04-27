import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student std1=new Student("최건우",23,176,71,"19011583",1,4.5);
		Teacher tchr1=new Teacher("김덕배",53,166,56,"876847",330,25);
		
		int classNumber=sc.nextInt();
		Student classMates[]=new Student[classNumber];//객체 배열 선언 및 동적 할당
		std1.show();
		tchr1.show();
	}
}
