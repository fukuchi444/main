package com.curriculum.software; // サブクラス(継承する側。子ども。トッピング+) 処理用②

import java.util.Random;

public class Sub extends Rpg{
	/* -----------------------------------------------------
 	[概要] 名前を入力すると指定の文言が出力されるようにする
 
 	【条件】 
		・数値は毎回変わるよう作成
		・サブクラス、スーパークラス、getter、setter、コンストラクタを使用
		・packageを2つ作成し、メインと処理を分ける
		・命名規則を遵守
 	----------------------------------------------------- */
	
	// 【修正点】 Subクラスを作成。乱数メソッド(Value())をRpgクラス → Subクラスに移動。行25：親クラスから変数を呼び出すためthis → superに変更。
	
	// 乱数を生成して各ステータスに乱数を振り分けるメソッド
	public void Value() {
		// ランダムクラスを呼び出す
		Random rand = new Random();
		

		// 各ステータス名が入った配列
		String[] all = {super.getHp(),super.getMp(),super.getAttack(),super.getAlacrity(),super.getDefense()};

		// ステータス数分、指定した範囲内で生成した乱数を格納
		for(int i = 0; i < all.length; i++) {
			int value = rand.nextInt(970) + 30;
			System.out.print((all[i]) + ":" + value + "\n");
		}
	}
}
