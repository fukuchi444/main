package com.curriculum.play; // メイン(実行用)

import java.util.Scanner;
import com.curriculum.software.Sub;

public class Brave{
	public static void main(String[] args) {
	/* -----------------------------------------------------
	 	[概要] 名前を入力すると指定の文言が出力されるようにする
	 
	 	【条件】 
			・数値は毎回変わるよう作成
			・サブクラス、スーパークラス、getter、setter、コンストラクタを使用
			・packageを2つ作成し、メインと処理を分ける
			・命名規則を遵守
	 	----------------------------------------------------- */
		
		// 【修正点】 名前を入力する処理を実行用のクラス(Brave)で実行させるため、Rpgクラス → Braveクラスに移動。scan.close()を最後の行に移動。
		

		// サブクラスのインスタンスを生成
		Sub game = new Sub();

		// スキャナークラスを呼び出す
		Scanner scan = new Scanner(System.in);

		// 名前を入力してもらう文言を表示
		System.out.println("名前を入力してね！\n");

		// 入力された名前を表示
		String name = scan.nextLine();
		System.out.println("こんにちは 「 " + name + " 」 さん\n");
		

		// 各ステータス名を代入する
		game.setStatus("ステータス");
		game.setHp("HP");
		game.setMp("MP");
		game.setAttack("攻撃力");
		game.setAlacrity("素早さ");
		game.setDefense("防御力");

		// 乱数を生成し、各ステータスに振り分けるメソッドの呼び出し
		game.Value();

		// 文言を代入
		game.setHere("\nさあ冒険に出かけよう！");
		
		// スキャナークラスを終了
		scan.close();
	}
}
