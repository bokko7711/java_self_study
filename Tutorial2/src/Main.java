
public class Main {
	
	public static void main(String[] args) {
		//자바 변수는 초기화하지 않으면 사용할 수 없음.

		int x=5;

	    int y=3;

	    System.out.println(max(x,y));
	}

	  //함수를 다른 곳에서도 호출하려면 static 키워드 필요.

	  static int max(int a,int b){

	  	return a>b? a:b;

	  }

	  //substring

	  //Math.pow()=>거듭제곱
	
	
}
