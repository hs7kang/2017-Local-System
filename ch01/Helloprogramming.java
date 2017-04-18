
public class Helloprogramming {
	static String fd = "-- 필드";//필드
    static String md = "-- 메소드";//마음대로 사용할수 있는 변수 fd md
	//메소드 라이트라는 메소드를 만났고 안에 인수를 넣어줄수있다. 넣어줬는데 데쉬데쉬필드니까 워드 값에 들어간다.다시 밑에를 넘어와서 라이트에서 다시 간다.md에 데쉬데쉬메소드를 찍고 다시 라이트로 온다.
    static int num;
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int n = 100;
		System.out.println("자바 클래스의 구조");
		write(fd);
		write(md);
		System.out.println(n);
	}
    
     public static void write(String word){
     System.out.println(word);
 
     }
     
}
