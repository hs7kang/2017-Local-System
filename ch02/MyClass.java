import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//램덤 클래스로부터 객체 r을 생성
		Random r = new Random();
		int number = r.nextInt(11)+10;
		//램덤 클래스로부터 숫자 10~20나오기
		
		
		String name = "김다솔";
		
		System.out.println(name + "의 운세는 " + number + "점");
	}

}
