package com.curriculum.software; // サブクラス(継承する側。子ども。トッピング+) 処理用②

public class Sub extends Bean{
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
	
	// 【8/17 修正点】 行20:ステータス名を配列の中へ格納。 行24:各getterをint型の配列の中へ格納。
	
	// 各ステータスに値を振り分けるメソッド
	public void Value() {

		// 各ステータス名が入った配列
		String[] all = {"HP", "MP", "攻撃力", "素早さ", "防御力"};

		// ステータス数分、指定した範囲内で生成した乱数を格納
		for(int i = 0; i < all.length; i++) {
			int[] value = {super.getHp(),super.getMp(),super.getAttack(),super.getAlacrity(),super.getDefense()};
			System.out.print((all[i]) + ":" + value[i] + "\n");
		}
	}
}
