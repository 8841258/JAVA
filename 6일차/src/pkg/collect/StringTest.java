package pkg.collect;

import javax.sound.midi.SysexMessage;

public class StringTest {

	public static void main(String[] args) {
		String str = "hello everybody!";
		char a = str.charAt(0);
		System.out.println("인덱스 위치의 한글자 : " + a);
		String b = str.substring(6, 11);
		System.out.println(b);
		System.out.println(str.contains("body"));
		System.out.println(str.endsWith("!"));
		System.out.println(str.startsWith("hel"));
		
		String num = "150222-3752133";
		String[] arr = num.split("-");
		System.out.println(arr[1]);
		char firstNum = arr[1].charAt(0);
		System.out.println(firstNum);
		
		if (arr[1].charAt(0) == 3) {
			String gender = "남자";
			System.out.println("성별은 " + gender);
		}
		
		
		
		String path = "c:/temp/image/a.jpg";
		int idx = path.indexOf("/");
		int idx2 = path.lastIndexOf("/");
		int idx3 = path.lastIndexOf("/", idx2+1);
		System.out.println(idx + ":" + idx2);
		
		int dotIndex = path.lastIndexOf(".");
		System.out.println("확장자 : " + path.substring(dotIndex+1));
		
		
		System.out.println("파일명 : " + StringUtil.getFileName(path));
		System.out.println("확장자 : " + StringUtil.getExtention(path));
		System.out.println("경로 : " + StringUtil.getPath(path));
		
		String e = "문자열 문자  ";
		String d = new String(e.getBytes(), "euc-kr");
		
		e = e.replace("문자", "숫자");
		System.out.println(e);
		
	}

	
	
	
}
