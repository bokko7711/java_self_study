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
		
		System.out.print(avg);//println=>자동 줄바꿈.
	}
}
