package co.yedam.star;

public class AppMain {

	public static void main(String[] args) {
		StarApp starapp = new StarApp();
		//starapp.draw(5);
		//starapp.drawInvert(3);
		starapp.drawEq(5);  //맨 위 이등변 삼각형
		starapp.drawEq(1,2); // 그 아래 삼각형
	}

}
