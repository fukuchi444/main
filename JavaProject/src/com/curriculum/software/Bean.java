package com.curriculum.software; // (スーパークラス。親。継承させる側。ノーマル。素) 処理用①

public class Bean {

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
	
	// 【修正点】 statusとhere以外の変数をint型に変更

	// フィールドに変数を定義
	private String status;
	private int hp;
	private int mp;
	private int attack;
	private int alacrity;
	private int defense;
	private String here;


	// コンストラクタを作成(引数あり)
	public Bean(int hp, int mp, int attack, int alacrity, int defense) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.alacrity = alacrity;
		this.defense = defense;
	}

	// コンストラクタを作成(引数なし)
	public Bean() {
		this.status = "ステータス";
		this.here = "\nさあ冒険に出かけよう！";
	}


	// 変数の値を取得する(getter)
	public int getHp(){
		return this.hp;
	}

	public int getMp(){
		return this.mp;
	}

	public int getAttack(){
		return this.attack;
	}

	public int getAlacrity(){
		return this.alacrity;
	}

	public int getDefense(){
		return this.defense;
	}

	public String getStatus(){
		return this.status;
	}

	public String getHere(){
		return this.here;
	}


	// 変数にステータス名を設定する(setter)
	public void setHp(int hp){
		this.hp = hp;
	}

	public void setMp(int mp){
		this.mp = mp;
	}
	
	public void setAttack(int attack){
		this.attack = attack;
	}

	
	public void setAlacrity(int alacrity){
		this.alacrity = alacrity;
	}

	public void setDefense(int defense){
		this.defense = defense;
	}


	// ステータス
	public void setStatus(String status){
		this.status = status;
		System.out.println(status);
	}

	// さあ冒険に出かけよう！
	public void setHere(String here){
		this.here = here;
		System.out.println(here);
	}
}
