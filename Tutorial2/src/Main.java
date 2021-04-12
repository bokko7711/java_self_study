public class Main {
	
	public static char getLastCharacter(String str) {
		return str.charAt(str.length()-1);
	}
	
	public static void main(String[] args) {
			System.out.println("campus의 마지막 글자는 "+getLastCharacter("campus")+"입니다.");
	}
}
