package question1_27sub; // 処理用

public class Bean1_27 {
	/* ----------------------------------------------------------------------------------------
	 * 【概要】 下記が入力されたときに、コンソール出力結果が表示されるように作成する
			  ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
	
	--------------------------------------------------------------------------------------- */
	// フィールドに変数を定義
	private String lion;
	private String elephant;
	private String panda;
	private String chimpanzee;
	private String zebra;
	private String parakeet;

	// コンストラクタを作成(引数あり)
	public Bean1_27(String lion, String elephant, String panda, String chimpanzee, String zebra, String parakeet) {
		this.lion = lion;
		this.elephant = elephant;
		this.panda = panda;
		this.chimpanzee = chimpanzee;
		this.zebra = zebra;
		this.parakeet = parakeet;
	}

	// 【8/28 修正点】 引数なしのコンストラクタの中身を空に
	// コンストラクタを作成(引数なし)
	public Bean1_27() {
	}

	// 変数の値を取得する(getter)
	public String getLion() {
		return this.lion;
	}

	public String getElephant() {
		return this.elephant;
	}

	public String getPanda() {
		return this.panda;
	}

	public String getChimpanzee() {
		return this.chimpanzee;
	}

	public String getZebra() {
		return this.zebra;
	}

	public String getParakeet() {
		return parakeet;
	}

	// 変数の値を設定する(setter)
	public void setLion(String lion) {
		this.lion = lion;
	}

	public void setElephant(String elephant) {
		this.elephant = elephant;
	}

	public void setPanda(String panda) {
		this.panda = panda;
	}

	public void setChimpanzee(String chimpanzee) {
		this.chimpanzee = chimpanzee;
	}

	public void setZebra(String zebra) {
		this.zebra = zebra;
	}

	public void setParakeet(String parakeet) {
		this.parakeet = parakeet;
	}

}
