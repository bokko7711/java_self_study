import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student std1=new Student("�ְǿ�",23,176,71,"19011583",1,4.5);
		Teacher tchr1=new Teacher("�����",53,166,56,"876847",330,25);
		
		int classNumber=sc.nextInt();
		Student classMates[]=new Student[classNumber];//��ü �迭 ���� �� ���� �Ҵ�
		std1.show();
		tchr1.show();
	}
}
