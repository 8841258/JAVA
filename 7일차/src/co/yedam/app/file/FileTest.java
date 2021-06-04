package co.yedam.app.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void fileCreate() throws IOException {
		//파일 생성
			File file = new File("d:/temp/diary.txt");
			boolean result = file.createNewFile();
			System.out.println(result);
	}
	
	private static void makefoler() {
		File file = new File("d:/temp/images");
		boolean result = file.mkdir();
		System.out.println(result);
	}
	
	private static void fileInfo() {
		File file = new File("d:/temp/image.png");
		System.out.println("파일 크기 : " + file.length());
		System.out.println("파일 이름 : " + file.getName());
	}
	
	
	public static void main(String[] args) throws IOException {
		//fileCreate();
		//makefoler();
		//fileInfo();
		folderlist();
	}

	private static void folderlist() {
		File file = new File("d:/temp");
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			
			for ( File a : list ) {
				if (StringUtil.getExtention(a.getName()).equals("png")) {
					System.out.println(a.getName());
					FileUtil.copy(a.getAbsolutePath(), "d:/temp/images/"+a.getName());
				}
				
			}
			
		}
		
	}

	






}
