public class Main {
	
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);//ctrl+shift+O�� ���� �ڵ� import
		int [] array=new int[100];//���� �迭�� array�� ����ڴ�. �� ���ο� ������ ������ ���, ũ��� 100�̴�.
		int sum=0;
		for(int i=0;i<100;i++) {
			array[i]=(int)(Math.random()*100+1);
			sum+=array[i];
		}
		int avg=sum/100;
		
		System.out.print(avg);//println=>�ڵ� �ٹٲ�.
	}
}
