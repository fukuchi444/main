package curriculum_B; // 実行用

import java.util.Scanner;
import java.util.Random;

public class Qes6 {
	public static void main(String[] args){

		/* -------------------------------------------
		 * [概要] 問６ 商品の残数を出力するシステムを作成する
	  　------------------------------------------- */
		System.out.println("問６");

		// 入力された文字を表示させる。
		// 入力された文字列を、記号の「 、」ごとに区切る。区切り文字を設定。
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("、");

		// 入力できる場所を分かりやすくするため、下記文言を表示する
		System.out.println("こんにちは～コジ〇電気です！\n在庫を確認したい商品名を入力してください　（複数ある場合は記号の 、で区切ってご入力ください）\n");

		// 配列kojimaに、入力された文字列を「 、」ごとに区切って格納する。
		String kojima[] = scan.nextLine().split("、");

		// kojimaの各要素を変数itemに格納。1つずつ表示。
		for (String item : kojima) {

			// 在庫数がランダムで生成されるようにする
			int stock = new Random().nextInt(12);

			// 入力させた商品名によって、違う文言を表示させる
			switch (item) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stock + "台です\n");
				break;

			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stock + "台です\n");
				break;

			case "扇風機":
				System.out.println("扇風機の残り台数は" + stock + "台です\n");
				break;

			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + stock + "台です\n");
				break;

			case "加湿器":
				System.out.println("加湿器の残り台数は" + stock + "台です\n");
				break;
				

			// 【7/26修正】 テレビのcase文を削除。テレビとディスプレイは同じ商品扱いなので、テレビとディスプレイのcase文を統合
			case "テレビ","ディスプレイ":
				
				// 変数maxを用意し、最大個数（11個）を代入
				int max =11;
				
				// 【7/26修正】 入力された商品名が、テレビの時は乱数を。ディスプレイの時は最大個数の11個から乱数を引いた数を表示させる
				System.out.println(item.equals("テレビ") ?  "テレビの残り台数は" + stock + "台です\n" : "ディスプレイの残り台数は" + (max - stock) + "台です\n");
				break;
				

			default :
				System.out.println("『" + item + "』" + "は指定の商品ではありません。\n");
				break;
			}
			scan.close();
		}
	}
}