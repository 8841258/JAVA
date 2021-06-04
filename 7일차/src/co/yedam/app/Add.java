package co.yedam.app;

public class Add {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 / value2);
			// catch는 if else if 구문처럼 둘 중 하나만 실행함.
			// catch 괄호 안에 정확한 에러를 기술해주면, 그 에러 메세지 알아서 출력
			// 괄호 안에 Exception을 넣으면 else가 실행된다.
		} catch (NumberFormatException e) {
			System.out.println("숫자를 넣어주세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자를 두개 넣어주세요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
