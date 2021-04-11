import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;//scanner 사용을 위한 import

public class Main {
	
	public static void main(String[] args) {
		//file : 자바 기본 제공 클래스
		File file=new File("input.txt");
		try {//-여기서 오류가 나면
			Scanner scanner=new Scanner(file);//이 문장 실행시 input.txt가 실제로 존재하지 않을 수 있는데, 이를 위한 예외처리를 해 주는 것을 자바에서 권고하고 있음.
			while(scanner.hasNextInt()){//스캐너가 읽는 파일에서 다음으로 읽어올 정수가 있는가?
				System.out.println(scanner.nextInt()*10);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어오는 도중 오류가 발생했습니다.");//이 구문 실행.
		}
		
	}
}
