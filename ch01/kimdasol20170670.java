
import java.util.*;
public class kimdasol20170670 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int count = 0, select = 0, com = 0;

		while (count < 100) {
			System.out.println("����(1),����(2),��(3)�� �Է��ϼ���");
			Scanner s = new Scanner(System.in);

			select = s.nextInt();
			com = r.nextInt(3) + 1;
			if ((select == 1) && (com == 2))
				System.out.println("���� �̰���ϴ�.");
			else if ((select == 1) && (com == 3))
				System.out.println("���� �̰���ϴ�.");
			else if ((select == 2) && (com == 1))
				System.out.println("���� �̰���ϴ�.");
			else if ((select == 2) && (com == 3))
				System.out.println("���� �̰���ϴ�.");
			else if ((select == 3) && (com == 1))
				System.out.println("�İ� �̰���ϴ�.");
			else if ((select == 3) && (com == 2))
				System.out.println("���� �̰���ϴ�.");
			else if (select == com)
				System.out.println("�����ϴ�.");
			count++;
		}

	}

	int a = r.nextInt(6) + 1;

	if((s==1)&&(d==3)||(s==2)&&(d==1)||(s==3)&&(d==2))System.out.println("���� ��ǻ�Ϳ��� �����ϴ�.");

	else if((s==1)&&(d==3)||(s==2)&&(d==1)||(s==3)&&(d==2))System.out.println("���� ��ǻ�͸� �̰���ϴ�.");else System.out.println("���� ��ǻ�Ͱ� �����ϴ�.");

}

}
