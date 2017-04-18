
import java.util.*;
public class kimdasol20170670 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int count = 0, select = 0, com = 0;

		while (count < 100) {
			System.out.println("가위(1),바위(2),보(3)를 입력하세요");
			Scanner s = new Scanner(System.in);

			select = s.nextInt();
			com = r.nextInt(3) + 1;
			if ((select == 1) && (com == 2))
				System.out.println("컴이 이겼습니다.");
			else if ((select == 1) && (com == 3))
				System.out.println("내가 이겼습니다.");
			else if ((select == 2) && (com == 1))
				System.out.println("내가 이겼습니다.");
			else if ((select == 2) && (com == 3))
				System.out.println("컴이 이겼습니다.");
			else if ((select == 3) && (com == 1))
				System.out.println("컴가 이겼습니다.");
			else if ((select == 3) && (com == 2))
				System.out.println("내가 이겼습니다.");
			else if (select == com)
				System.out.println("비겼습니다.");
			count++;
		}

	}

	int a = r.nextInt(6) + 1;

	if((s==1)&&(d==3)||(s==2)&&(d==1)||(s==3)&&(d==2))System.out.println("내가 컴퓨터에게 졌습니다.");

	else if((s==1)&&(d==3)||(s==2)&&(d==1)||(s==3)&&(d==2))System.out.println("내가 컴퓨터를 이겼습니다.");else System.out.println("나랑 컴퓨터가 비겼습니다.");

}

}
