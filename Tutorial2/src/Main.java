import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		int switcher;
		Scanner sc=new Scanner(System.in);
		switcher=sc.nextInt();
		Fruit fruit;
		if (switcher==1) {
			fruit=new Peach();
		}
		else {
			fruit=new Banana();
		}
		
		fruit.show();
	}
}
