
public class Main {
	
	final static double PI=3.141592;
	//final => 상수라는 의미. 절대 바뀔 수 없음.(const같은 애)
	//static : 이 클래스 내부에서만 공유하는 자원이라는 뜻.
	final static int INT_MAX=2147483647;
	//자바에서 int가 담을 수 있는 최대값은 21...저거임. 이 이상의 숫자 대입시 overflow 발생.
	
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
