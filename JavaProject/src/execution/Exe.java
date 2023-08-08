package execution; // 実行用

import process.Proc;

public class Exe {
	public static void main(String[] args) {
		/* -----------------------------------------------------
		 * [概要] 下記条件に沿って、指定の文言が出力されるようにする
		 * 
		 * 【条件】 
			・JavaProjectを新規作成し、実行用と処理用のpackageを作成
			・適切なファイルに、フィールド上で必要な分の変数を定義
			・thisを使用
			・現在の日時を取得
		 ----------------------------------------------------- */
		// 処理用のクラスを呼び出す
		Proc sentence = new Proc();
		
		// 処理用のクラスから各変数を呼び出して指定の文言を出力
		// こんにちは！ここは日本です！
		System.out.println(sentence.location);
		
		// この寿司はうまい
		System.out.println(sentence.delicious);
		
		// 寿司は和食です
		System.out.println(sentence.food);
		
		// 今の現在日時はyyyy/MM/dd H:m:s(←現在時刻を表示)です
		System.out.println(sentence.current);
	}

}
