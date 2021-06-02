package pkg.collect;

public class StringUtil {
	//파일명 추출
	
	public static String getFileName(String path) {
		String s;
		
		if (path == null) {
			return null;
		}
		
		s = path.substring(path.lastIndexOf("/")+1);
		return s;
	}
	
	//확장자 추출
	public static String getExtention (String path) {
		String result;
		
		if (path == null) {
			return null;
		}
		
		result = path.substring(path.lastIndexOf(".")+1);
		return result;
	}
	
	//경로 추출
	public static String getPath (String path) {
		String result;
		
		if (path == null) {
			return null;
		}
		
		result = path.substring(0, path.lastIndexOf("/"));
		//인덱스는 (0,5)이면 5 미만까지 출력임...
		return result;
		
	}
	
	
}
