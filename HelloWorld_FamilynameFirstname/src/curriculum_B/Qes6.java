package curriculum_B;

public class Qes6 {
	public static void main(String[] args){
		
	/* -------------------------------------------
	 * [概要] 問６ for文を使用して9×20までのかけ算をする
	  　------------------------------------------- */
		System.out.println("問６");
		
		// 変数tateを1～9まで繰り返す
		for (int  tate = 1; tate < 10; tate++) {
			// 変数yokoを1～20まで繰り返す
			for (int yoko = 1; yoko < 21; yoko++) {
				// 数字が3桁に満たない場合は、3桁になるまで0を付けて計算式を表示。一式ごとに || で区切る
				System.out.print(String.format("%03d * %03d = %03d",tate,yoko,tate * yoko) + " || ");
			}
			System.out.print("\n");
		}
	}
}