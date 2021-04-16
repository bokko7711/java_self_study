public class Main {
	
	public static void main(String[] args) {
		
		Node one=new Node(10,20);
		Node two=new Node(-10,-20);
		Node center=one.getAverage(two);
		System.out.printf("x= %d , y= %d\n",center.getX(),center.getY());
	}
}
