import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;//scanner ����� ���� import

public class Main {
	
	public static void main(String[] args) {
		//file : �ڹ� �⺻ ���� Ŭ����
		File file=new File("input.txt");
		try {//-���⼭ ������ ����
			Scanner scanner=new Scanner(file);//�� ���� ����� input.txt�� ������ �������� ���� �� �ִµ�, �̸� ���� ����ó���� �� �ִ� ���� �ڹٿ��� �ǰ��ϰ� ����.
			while(scanner.hasNextInt()){//��ĳ�ʰ� �д� ���Ͽ��� �������� �о�� ������ �ִ°�?
				System.out.println(scanner.nextInt()*10);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �о���� ���� ������ �߻��߽��ϴ�.");//�� ���� ����.
		}
		
	}
}
