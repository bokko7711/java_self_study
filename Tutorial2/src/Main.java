public class Main {
	
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);//ctrl+shift+O를 눌러 자동 import
		int [] array=new int[100];//정수 배열을 array를 만들겠다. 이 새로운 변수는 정수를 담고, 크기는 100이다.
		int sum=0;
		for(int i=0;i<100;i++) {
			array[i]=(int)(Math.random()*100+1);
			sum+=array[i];
		}
		int avg=sum/100;
		
		System.out.println("average = "+avg);//println=>자동 줄바꿈.
		
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
