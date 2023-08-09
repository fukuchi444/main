package question1_23; // 実行用

import java.util.Objects;

public class Output {
	public static void main(String[] args) {
		/* -----------------------------------------------------------
		 * [概要] this、setter、getter、フィールドを使用し、指定の文言を出力する
		 * 
		 * 【文言】動物名：ライオン、体長：2.1m、速度：80km/h
		 ------------------------------------------------------------- */

		// インスタンスを生成
		Capsule cap = new Capsule();

		// setterメソッドを呼び出し、引数に値を代入。getterメソッドで値を取得し、指定の文言になるよう出力。

		// 動物名：ライオン
		cap.setAnimal("ライオン");

		// nullチェック 
		if(Objects.isNull(cap.getAnimal())) {
			System.out.println("エラーです");
		} else {
			System.out.println("動物名：" + cap.getAnimal());
		}


		// 体長：2.1m
		cap.setSize(2.1);

		// nullチェック 
		if(Objects.isNull(cap.getSize())) {
			System.out.println("エラーです");
		} else {
			System.out.println("体長：" + cap.getSize() + "m");
		}


		// 速度：80km/h
		cap.setSpeed(80);

		// nullチェック 
		if(Objects.isNull(cap.getSpeed())) {
			System.out.println("エラーです");
		} else {
			System.out.println("速度：" + cap.getSpeed() + "km/h");
		}
	}
}
