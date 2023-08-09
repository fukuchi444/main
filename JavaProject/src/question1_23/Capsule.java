package question1_23; // 処理用

import java.util.Objects;

public class Capsule {
	/* -----------------------------------------------------------
	 * [概要] this、setter、getter、フィールドを使用し、指定の文言を出力する
	 * 
	 * 【文言】動物名：ライオン、体長：2.1m、速度：80km/h
	 ------------------------------------------------------------- */

	// フィールドに変数を定義
	private String animal;
	private double size;
	private int speed;
	

	// コンストラクタを作成  【8/9 修正点：今回コンストラクタ不要につき削除(比較のためコメントアウトにしています)。ｉｆ文でのnullチェック削除】】
	/*public Capsule() {
		this.animal = "ライオン";
		this.size = 2.1;
		this.speed = 80;
	}*/


	// 変数に値を設定するメソッド(setter)
	public void setAnimal(String animal){
		this.animal = animal;

		// nullチェック 【8/9 Objectsクラスを使用したnullチェックを追記】
		if(Objects.nonNull(animal)) {
			System.out.println(animal);
		}
	}


	public void setSize(double size){
		this.size = size;
	}


	public void setSpeed(int speed){
		this.speed = speed;
	}



	// 変数の値を取得するメソッド(getter)
	public String getAnimal(){
		return this.animal;
	}

	public double getSize(){
		return this.size;
	}

	public int getSpeed(){
		return this.speed;
	}
}
