import java.util.Scanner;//scanner 사용을 위한 import

public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//입력을 위한 스캐너 생성
        System.out.print("정수를 입력하세요 : ");
        int x=sc.nextInt();//nextInt로 다음에 입력받게 되는 정수를 x에 저장
        System.out.println("입력된 수는 "+x+"입니다");//x 출력
        sc.close();
	}
}
