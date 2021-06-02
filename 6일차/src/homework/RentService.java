package homework;

import java.util.Scanner;

public class RentService implements Service {
	Rent[] rents;
	int cnt;
	int maxCnt = 10;
	Scanner scan = new Scanner(System.in);

	public RentService() {
		super();
		rents = new Rent[maxCnt];
	}

	@Override
	public void input() {
		if (cnt > maxCnt) {
			System.out.println("Unable to add more...");
			return;
		}
		System.out.println("Enter name of the book>");
		String title = scan.next();
		System.out.println("Enter member name>");
		String name = scan.next();
		String date = "02.06.2021";
		rents[cnt++] = new Rent(title, name, date);
		System.out.println("Registered rented book>> " + cnt);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Enter number of the rent to update>");
		int num = scan.nextInt();
		if (num > cnt - 1) {
			System.out.println("The member numer does not exist");
			return;
		} else {
			System.out.printf("Change %d rent?>\n", num);

			System.out.println("Book title>");
			String title = scan.next();
			System.out.println("Borrower's name>");
			String name = scan.next();
			rents[num].setTitle(title);
			rents[num].setName(name);

			System.out.println("Update completed.");
		}
	}

	@Override
	public void delete() {
		System.out.println("Enter number of the rent to delete>");
		int num = scan.nextInt();
		if (num > cnt - 1) {
			System.out.println("The member numer does not exist");
			return;
		}
		else {
			System.out.printf("You really want to delete rent %s??? y/n> \n", rents[num]);
			String yesNo=scan.next();
			if (yesNo.equals("y")) {
				for(int i=num;i<cnt-1;i++) {
					rents[i]=rents[i+1];
				} 
				cnt--;
				System.out.println("Delete Completed!");
			}else {
				return;
			}
			
		}
//		for (int i = num; i < cnt - 1; i++) {
//			rents[i] = rents[i + 1];
//		}
//		cnt--;
//		System.out.println("Delete Completed!");
	}

	@Override
	public void selectAll() {
		System.out.println(String.format("%-20s  %-20s  %-20s", "title", "name", "date\n"));
		System.out.println("===============================================================================");
		for (int i = 0; i < cnt; i++) {
			System.out.println(String.format("%-20s   %-20s   %-20s", rents[i].getTitle(), rents[i].getName(),
					rents[i].getDate()));
		}
		System.out.println("===============================================================================");

	}

	@Override
	public void selectOne() {
		System.out.println("Enter a rent Number to search>");
		int idx = scan.nextInt();
		if (idx > cnt - 1) {
			System.out.println("Number not exist...");
			return;
		}
		System.out.println(String.format("%-20s   %-20s   %-20s", rents[idx].getTitle(), rents[idx].getName(),
				rents[idx].getDate()));

	}

}
