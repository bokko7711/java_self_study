public class Main implements Base,Plus{
	
	public void show() {
		System.out.println("show function from Base");
	}
	public void play() {
		System.out.println("play function from Base");
	}
	public void pause() {
		System.out.println("pause function from Plus");
	}
	public void stop() {
		System.out.println("stop function from Plus");
	}
	
	public static void main(String[] args) {
		Main main=new Main();
		
		main.show();
		main.play();
		main.pause();
		main.stop();
	}
}
