package pkg.friend;

import java.util.Scanner;

public class FriendAppMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		FriendList list = new FriendList();
		
		Friend f;
		
		
		while (run) {
			
			int selectNo;
			
			System.out.println("-------------------------------------친구목록----------------------------------");
			System.out.println("1.친구 등록   2.친구 수정   3.친구 삭제   4.친구목록 전체 조회   5.친구목록 단건 조회   6.종료");
			System.out.print("번호를 선택하세요.>");
			selectNo = scanner.nextInt();
			
			if (selectNo == 1) { 
				System.out.print("추가할 친구가 학교친구면 1, 회사친구면 2를 입력하세요. >> ");
				int friendNum = scanner.nextInt();
				if (friendNum == 1) {
					System.out.print("입력할 학교명 >> ");
					String insertSchool = scanner.next();
					System.out.print("입력할 이름 >> ");
					String insertSchoolName = scanner.next();
					System.out.print("입력할 휴대폰 번호 >> ");
					String insertSchoolPhone = scanner.next();
					f = new SchoolFriend(insertSchool, insertSchoolName, insertSchoolPhone);
					list.insert(f);
				}
				
				else if (friendNum == 2) {
					
					System.out.print("입력할 회사명 >> ");
					String insertCompany = scanner.next();
					System.out.print("입력할 이름 >> ");
					String insertCompanyName = scanner.next();
					System.out.print("입력할 휴대폰 번호 >> ");
					String insertCompanyPhone = scanner.next();
					f = new SchoolFriend(insertCompany, insertCompanyName, insertCompanyPhone);
					list.insert(f);
				}
				
			} else if (selectNo == 2) {
				
				System.out.print("수정할 목록 번호 입력 >> ");
				int updateIdx = scanner.nextInt();
				System.out.print("수정할 구분(회사명) >> ");
				String updateGubun = scanner.next();
				System.out.print("수정할 이름 >> ");
				String updateName = scanner.next();
				System.out.print("수정할 전화번호 >> ");
				String updatePhone = scanner.next();
				f = new SchoolFriend(updateGubun, updateName, updatePhone);
				list.update(updateIdx, f);
				
			} else if (selectNo == 3) {
				
				System.out.print("삭제할 목록 번호 입력 >> ");
				int deleteIdx = scanner.nextInt();
				list.delete(deleteIdx);
				
			} else if (selectNo == 4) {
				
				list.selectAll();
				
			} else if (selectNo == 5) {
				
				System.out.print("검색할 친구 이름을 입력하세요. >> ");
				String friendSearch = scanner.next();
				//일치하는 친구 이름이 있으면(널값이 아니면) 친구 이름이 있는 리스트 출력
				if (list.selectOne(friendSearch) != null) {
					System.out.println(friendSearch + " 는/은 친구 목록에 존재합니다.");
					System.out.println(list.selectOne(friendSearch));
				}
				//일치하는 친구 이름이 없으면(널값이면) 검색할 친구가 없다는 메세지 출력
				if (list.selectOne(friendSearch) == null) {
					System.out.println("검색된 친구가 없습니다.");
				}
			}
			
			else {
				run = false;
			}
		}
		System.out.println("친구목록 프로그램 종료");

		
		
		
		
		
		
	}


	
}
