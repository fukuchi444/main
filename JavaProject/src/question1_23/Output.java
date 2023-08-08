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

		// 指定の文言になるように、カプセル化した各メソッドの値を呼び出して出力
		// 動物名：ライオン
		System.out.println("動物名：" + cap.getAnimal());
		
		// 体長：2.1m
		System.out.println("体長：" + cap.getSize() + "m");
		
		// 速度：80km/h
		System.out.println("速度：" + cap.getSpeed() + "km/h");
	}
}
