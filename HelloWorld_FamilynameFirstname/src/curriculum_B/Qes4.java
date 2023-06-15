package curriculum_B;


public class Qes4 {
	public static void main(String[] args){
		
	/* -----------------------------------------------
	 * [概要] 問４ for文を使用して九九のかけ算表を作成する
	  　----------------------------------------------- */
		System.out.println("問４");
		
		// 変数tateを、1～9まで繰り返す
		for (int  tate = 1; tate < 10; tate++) {
			// 変数yokoを、1～9まで繰り返す
			for (int yoko = 1; yoko < 10; yoko++) {
				// 数字が2桁に満たない場合は、2桁になるまで0を付けて九九の計算式を表示。一式ごとに || で区切る
				System.out.print(String.format("%02d * %02d = %02d",tate,yoko,tate * yoko) + " || ");
			}
			System.out.print("\n");
		}
	}
}
