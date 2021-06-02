package homework;

import java.util.Scanner;


public class AppMain {

	static Scanner scanner = new Scanner(System.in);
	Service memberService = new MemberService();
	RentService rentService = new RentService();
	BookService bookService = new BookService();
	
	public void bookManager() {
		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.Register a book  2.Update Book  3.Delete Book  4.Search All  5.One book search   6.Exit");
			System.out.print("Choose an option>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				bookService.input();
			} else if (selectNo == 2) {
				bookService.update();
			} else if (selectNo == 3) {
				bookService.delete();
			} else if (selectNo == 4) {
				bookService.selectAll();
			}else if (selectNo == 5) {
				bookService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("Exit managing Books");
	}
	
	public void memberManager() {
		int selectNo = 0;
		boolean run = true;		
		while (run) {
			System.out.println("1.Register a Member  2.Update Member  3.Delete Member  4.Search All Member  5.One Member search   6.Exit");
			System.out.print("Choose a option>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				memberService.input();
			} else if (selectNo == 2) {
				memberService.update();
			} else if (selectNo == 3) {
				memberService.delete();
			} else if (selectNo == 4) {
				memberService.selectAll();
			}else if (selectNo == 5) {
				memberService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("Exit managing Members");
	}
	
	public void rentManager() {
		int selectNo = 0;
		boolean run = true;		
		while (run) {
			System.out.println("1.Register a Rent  2.Update Rent  3.Delete Rent  4.Search All Rent  5.One Rent search   6.Exit");
			System.out.print("Choose a option>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				rentService.input();
			} else if (selectNo == 2) {
				rentService.update();
			} else if (selectNo == 3) {
				rentService.delete();
			} else if (selectNo == 4) {
				rentService.selectAll();
			}else if (selectNo == 5) {
				rentService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("Exit managing Rent");
	}
	
	public static void main(String[] args) {
		AppMain app = new AppMain();
		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.Book management  2.Member management   3.Rent management  4.Exit");
			System.out.print("Choose a option>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.bookManager();
			} else if (selectNo == 2) {
				app.memberManager();
			} else if (selectNo == 3) {
				app.rentManager();
			} else {
				run = false;
			}
		}
		System.out.println("Exit the program");
	}
}
