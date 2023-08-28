package question1_27sub; // 処理用

import java.util.Objects;
import java.util.Scanner;

public class Sub1_27 extends Bean1_27 {
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

	public void Name() {
		// スキャナークラスを呼び出す
		Scanner scan = new Scanner(System.in);

		// 名前を入力してもらう文言を表示
		System.out.println("コンソールに文字を入力してください\n");
		String display = scan.next();

		// 各項目名を入れた配列
		String[] items = { "動物名", "体長", "速度" };

		// 入力された値を配列に格納。指定の記号ごとに区切って単語にする
		String[] animal = display.split("[,:]");

		// 入力された値ぶん繰り返す。項目が3つあるため、iを3ずつ増やす
		for (int i = 0; i < animal.length; i = i + 3) {

			System.out.println(items[0] + ":" + animal[i]);
			System.out.println(items[1] + ":" + animal[i + 1]);
			System.out.println(items[2] + ":" + animal[i + 2]);

			// 【8/28修正】 各case文にｎｕｌｌチェックを追加。setterに値を代入。
			// 動物名によって表示する学名を切り替える
			switch (animal[i]) {
			case "ライオン":
				super.setLion("パンテラ レオ");
				if (Objects.isNull(super.getLion())) {
					System.out.println("エラーです" + "\n");
				} else {
					System.out.println("学名：" + super.getLion() + "\n");
				}
				break;

			case "ゾウ":
				super.setElephant("ロキソドンタ・サイクロティス");
				if (Objects.isNull(super.getElephant())) {
					System.out.println("エラーです" + "\n");
				} else {
					System.out.println("学名：" + super.getElephant() + "\n");
				}
				break;

			case "パンダ":
				super.setPanda("アイルロポダ・メラノレウカ");
				if (Objects.isNull(super.getPanda())) {
					System.out.println("エラーです" + "\n");
				} else {
					System.out.println("学名：" + super.getPanda() + "\n");
				}
				break;

			case "チンパンジー":
				super.setChimpanzee("パン・トゥログロディテス");
				if (Objects.isNull(super.getChimpanzee())) {
					System.out.println("エラーです" + "\n");
				} else {
					System.out.println("学名：" + super.getChimpanzee() + "\n");
				}
				break;

			case "シマウマ":
				super.setZebra("チャップマンシマウマ");
				if (Objects.isNull(super.getZebra())) {
					System.out.println("エラーです" + "\n");
				} else {
					System.out.println("学名：" + super.getZebra() + "\n");
				}
				break;

			case "インコ":
				super.setParakeet("不明");
				if (Objects.isNull(super.getParakeet())) {
					System.out.println("エラーです" + "\n");
				} else {
					System.out.println("学名：" + super.getParakeet() + "\n");
				}
				break;
			}
		}
		scan.close();
	}
}