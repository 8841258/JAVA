package homework;

import java.util.Scanner;

public class MemberService implements Service {
	Member[] members;
	int cnt;
	int maxCnt = 10;

	Scanner scan = new Scanner(System.in);

	public MemberService() {
		members = new Member[maxCnt];
	}

	@Override
	public void input() {
		if (cnt > maxCnt) {
			System.out.println("Unable to add more...");
			return;
		}
		System.out.println("Member Name>");
		String name = scan.next();
		System.out.println("Phone Number>");
		String phone = scan.next();
		members[cnt++] = new Member(name, phone);
		System.out.println("Registered Member Number: " + cnt);
	}

	@Override
	public void update() {
		System.out.println("Enter number of the member to update>");
		int num = scan.nextInt();
		if (num >= cnt - 1) {
			System.out.println("The member numer does not exist");
			return;
		} else {
			System.out.printf("Change %s's Phone Number?\n", members[num]);

			System.out.println("Enter new Phone Number>");
			String phone = scan.next();
			members[num].setPhone(phone);
			System.out.println("Update completed.");
		}

	}

	@Override
	public void delete() {
		System.out.println("Enter number of the member to delete>");
		int num = scan.nextInt();
		if (num > cnt - 1) {
			System.out.println("The member numer does not exist");
			return;
		}
//		why this not working?????
		System.out.printf("You really want to delete member %s??? y/n>", members[num]);
		String yesNo = scan.next();
		if (yesNo.equals("y")) {
			for (int i = num; i < cnt-1; i++) {
				members[i] = members[i + 1];
			}
			cnt--;
			System.out.println("Delete Completed!");
		} else {
			return;
		}
//		for (int i = num; i < cnt-1; i++) {
//			members[i] = members[i + 1];
//		}
//		cnt--;
//		System.out.println("Delete Completed!");
	}

	@Override
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "name", "Phone number"));
		System.out.println("===============================================================================");
		for (int i = 0; i < cnt; i++) {
			System.out.println(String.format("%-20s %-20s", members[i].getName(), members[i].getPhone()));
		}
		System.out.println("===============================================================================");

	}

	@Override
	public void selectOne() {
		System.out.println("Enter a member Number to search>");
		int idx = scan.nextInt();
		if (idx > cnt - 1) {
			System.out.println("Number not exist...");
			return;
		}
		System.out.printf("Member name: %s, Phone Number: %s\n", members[idx].getName(), members[idx].getPhone());
	}

}
