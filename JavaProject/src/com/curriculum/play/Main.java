package com.curriculum.play; // メイン(実行用)

import java.util.Random;
import java.util.Scanner;
import com.curriculum.software.Sub;

public class Main{
	public static void main(String[] args) {
	/* -----------------------------------------------------
	 	[概要] 名前を入力すると下記のように出力されるようにする
	 	
				こんにちは 「 名前 」 さん
				ステータス
				HP：849
				MP：862
				攻撃力：375
				素早さ：937
				防御力：24

				さあ冒険に出かけよう！
	 
	 	【条件】 
			・数値は毎回変わるよう作成
			・サブクラス、スーパークラス、getter、setter、コンストラクタを使用
			・packageを2つ作成し、メインと処理を分ける
			・命名規則を遵守
	 	----------------------------------------------------- */
		
		// 【8/17 修正点】 行39～44:代入する値をStiring型 → int型に変更
		

		// サブクラスのインスタンスを生成
		Sub game = new Sub();

		// スキャナークラスを呼び出す
		Scanner scan = new Scanner(System.in);

		// 名前を入力してもらう文言を表示
		System.out.println("名前を入力してね！\n");

		// 入力された名前を表示
		String name = scan.nextLine();
		System.out.println("こんにちは 「 " + name + " 」 さん\n");
		
		// ランダムクラスを呼び出す
		Random rand = new Random();

		// 各ステータスに乱数を代入する
		game.setStatus("ステータス");
		game.setHp(rand.nextInt(500) + 500);
		game.setMp(rand.nextInt(500) + 500);
		game.setAttack(rand.nextInt(970) + 30);
		game.setAlacrity(rand.nextInt(970) + 30);
		game.setDefense(rand.nextInt(970) + 30);

		// 乱数を生成し、各ステータスに振り分けるメソッドの呼び出し
		game.Value();

		// 文言を代入
		game.setHere("\nさあ冒険に出かけよう！");
		
		// スキャナークラスを終了
		scan.close();
	}
}
