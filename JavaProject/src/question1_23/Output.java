package question1_23; // 実行用

public class Output {
	public static void main(String[] args) {
		/* -----------------------------------------------------------
		 * [概要] this、setter、getter、フィールドを使用し、指定の文言を出力する
		 * 
		 * 【文言】動物名：ライオン、体長：2.1m、速度：80km/h
		 ------------------------------------------------------------- */

		// インスタンスを生成
		Capsule cap = new Capsule();
		

		// 【8/9 修正点：呼び出し元(このクラス内)でsetterメソッドに値を代入し、getterメソッドで値を呼び出して出力】
		
		// setterメソッドを呼び出し、引数に値を代入。getterメソッドで値を取得し、指定の文言になるよう出力。
		cap.setAnimal("ライオン");
		System.out.println("動物名：" + cap.getAnimal());
		

		cap.setSize(2.1);
		System.out.println("体長：" + cap.getSize() + "m");
		

		cap.setSpeed(80);
		System.out.println("速度：" + cap.getSpeed() + "km/h");
	}
}
