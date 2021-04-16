
public class Node {
	private int x;//private : �ܺο��� �ѹ��� ������ �� ����. �Լ��� ���� ����.
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;//�ڽ��� ���� x=�Ű����� x;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public Node(int x, int y) {//������.
		this.x=x;
		this.y=y;
	}
	
	public Node getAverage(Node other) {//�ڽ� ���� �ٸ� ����� ��ġ�� ��հ� ����.
		return new Node((this.x+other.x)/2,(this.y+other.y)/2);
	}
}


















