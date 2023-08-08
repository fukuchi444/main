package question1_23; // 処理用

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


	// nullチェック用の変数 (double以外)
	String check1 = null;
	Integer check2 = null;


	// コンストラクタを作成
	public Capsule() {
		this.animal = "ライオン";
		this.size = 2.1;
		this.speed = 80;

		// nullチェック (double以外)
		if(animal.equals(check1)) {
			System.out.println(check1);
		} else if(speed < -1)
			System.out.println(check2);
	}



	// 変数に値を設定するメソッド(setter)
	public void setAnimal(String animal){
		this.animal = animal;
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
