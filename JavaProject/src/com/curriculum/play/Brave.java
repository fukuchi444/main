package com.curriculum.play; // メイン(実行用)

import com.curriculum.software.Rpg;

public class Brave extends Rpg{
	public static void main(String[] args) {
	/* -----------------------------------------------------
	 	[概要] 名前を入力すると指定の文言が出力されるようにする
	 
	 	【条件】 
			・数値は毎回変わるよう作成
			・サブクラス、スーパークラス、getter、setter、コンストラクタを使用
			・packageを2つ作成し、メインと処理を分ける
			・命名規則を遵守
	 	----------------------------------------------------- */

		// インスタンスを生成
		Rpg rpg = new Rpg();

		// 名前を入力するメソッドの呼び出し
		rpg.Name();
		

		// 各ステータス名を代入する
		rpg.setStatus("ステータス");
		rpg.setHp("HP");
		rpg.setMp("MP");
		rpg.setAttack("攻撃力");
		rpg.setAlacrity("素早さ");
		rpg.setDefense("防御力");

		// 乱数を生成し、各ステータスに振り分けるメソッドの呼び出し
		rpg.Value();

		// 文言を代入
		rpg.setHere("\nさあ冒険に出かけよう！");
	}
}
