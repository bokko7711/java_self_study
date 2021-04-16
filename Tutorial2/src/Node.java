
public class Node {
	private int x;//private : 외부에서 한번에 접근할 수 없음. 함수를 통해 접근.
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;//자신이 가진 x=매개변수 x;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public Node(int x, int y) {//생성자.
		this.x=x;
		this.y=y;
	}
	
	public Node getAverage(Node other) {//자신 노드와 다른 노드의 위치의 평균값 산출.
		return new Node((this.x+other.x)/2,(this.y+other.y)/2);
	}
}


















