package com.curriculum.software; // 処理用

import java.util.Random;
import java.util.Scanner;

public class Rpg {

	/* -----------------------------------------------------
 	[概要] 名前を入力すると指定の文言が出力されるようにする
 
 	【条件】 
		・数値は毎回変わるよう作成
		・サブクラス、スーパークラス、getter、setter、コンストラクタを使用
		・packageを2つ作成し、メインと処理を分ける
		・命名規則を遵守
 	----------------------------------------------------- */

	// フィールドに変数を定義
	private String status;
	private String hp;
	private String mp;
	private String attack;
	private String alacrity;
	private String defense;
	private String here;


	// コンストラクタを作成(引数あり)
	public Rpg(String hp, String mp, String attack, String alacrity, String defense) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.alacrity = alacrity;
		this.defense = defense;
	}

	// コンストラクタを作成(引数なし)
	public Rpg() {
		this.status = "ステータス";
		this.here = "\nさあ冒険に出かけよう！";
	}


	// 変数の値を取得する(getter)
	public String getHp(){
		return this.hp;
	}

	public String getMp(){
		return this.mp;
	}

	public String getAttack(){
		return this.attack;
	}

	public String getAlacrity(){
		return this.alacrity;
	}

	public String getDefense(){
		return this.defense;
	}

	public String getStatus(){
		return this.status;
	}

	public String getHere(){
		return this.here;
	}


	// 変数にステータス名を設定する(setter)
	// HP
	public void setHp(String hp){
		this.hp = hp;
	}

	// MP
	public void setMp(String mp){
		this.mp = mp;
	}
	
	// 攻撃力
	public void setAttack(String attack){
		this.attack = attack;
	}

	
	// 素早さ
	public void setAlacrity(String alacrity){
		this.alacrity = alacrity;
	}

	// 防御力
	public void setDefense(String defense){
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


	// 名前を入力するメソッド
	public void Name() {
		// スキャナークラスを呼び出す
		Scanner scan = new Scanner(System.in);

		// 名前を入力してもらう文言を表示
		System.out.println("名前を入力してね！\n");

		// 入力された名前を表示し、スキャナークラスを終了する
		String name = scan.nextLine();
		System.out.println("こんにちは 「 " + name + " 」 さん\n");
		scan.close();
	}


	// 乱数を生成して各ステータスに乱数を振り分けるメソッド
	public void Value() {
		// ランダムクラスを呼び出す
		Random rand = new Random();

		// 各ステータス名が入った配列
		String[] all = {this.hp,this.mp,this.attack,this.alacrity,this.defense};

		// ステータス数分、指定した範囲内で生成した乱数を格納
		for(int i = 0; i < all.length; i++) {
			int value = rand.nextInt(970) + 30;
			System.out.print((all[i]) + ":" + value + "\n");
		}
	}

}
