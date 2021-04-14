public class Main {
	
	public static int makeFibonacci(int i) {
		if(i==1||i==2) return 1;
		else return makeFibonacci(i-2)+makeFibonacci(i-1);
	}
	
	public static void main(String[] args) {
			System.out.println(makeFibonacci(8));
	}
}
