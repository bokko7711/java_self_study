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
		
		System.out.println("average = "+avg);//println=>�ڵ� �ٹٲ�.
		
		int [][]multiArray=new int[10][10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				multiArray[i][j]=(int)(Math.random()*10);
				System.out.print(multiArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
