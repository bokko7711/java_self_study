
public class Main {
	
	final static double PI=3.141592;
	//final => ������ �ǹ�. ���� �ٲ� �� ����.(const���� ��)
	//static : �� Ŭ���� ���ο����� �����ϴ� �ڿ��̶�� ��.
	final static int INT_MAX=2147483647;
	//�ڹٿ��� int�� ���� �� �ִ� �ִ밪�� 21...������. �� �̻��� ���� ���Խ� overflow �߻�.
	
	public static void main(String[] args) {
		int r=30;
		System.out.println(r*r*PI);
		
		int x=1,y=2;
		
		System.out.println("x+y= "+(x+y));
		System.out.println("x-y= "+(x-y));
		System.out.println("x*y= "+(x*y));
		System.out.println("x/y= "+(x/y));
	}

}
