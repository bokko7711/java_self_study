import java.util.Scanner;//scanner ����� ���� import

public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//�Է��� ���� ��ĳ�� ����
        System.out.print("������ �Է��ϼ��� : ");
        int x=sc.nextInt();//nextInt�� ������ �Է¹ް� �Ǵ� ������ x�� ����
        System.out.println("�Էµ� ���� "+x+"�Դϴ�");//x ���
        sc.close();
	}
}
