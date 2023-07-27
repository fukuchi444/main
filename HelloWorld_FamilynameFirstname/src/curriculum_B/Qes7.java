package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args){
		/* ----------------------------------------------------------
		 * [概要] 問７ 入力された人数分の、生徒の成績を管理するプログラムを作成
		 * [詳細] 条件は3つ。科目は英語、数学、理科、社会。
	   ---------------------------------------------------------- */
		System.out.println("問７");

		// 入力できる箇所を分かりやすくするため、文言を表示
		System.out.print("生徒の人数を入力してください(2以上)：");
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();


		// 各教科名を入れた箱
		String[] subjects = {"英語","数学","社会","理科"};

		// 配列に入力された人数と、教科数を入れてる箱
		int[][] result = new int[student][subjects.length];

		// 生徒ごとの箱
		int[] person = new int[student];

		// 教科ごとの箱
		int[] kinds = new int[subjects.length];

		// 全体の平均点を出すときに使用
		double whole = 0.0;

		// 入力された生徒数ぶん繰り返す
		for (int i = 0; i < result.length; i++){

			// 教科数ぶん繰り返す
			for (int j = 0; j < subjects.length; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
				result[i][j] = scan.nextInt();

				// 生徒ごと、教科ごとの箱に入力された値を足しながら入れる
				person[i] += result[i][j];
				kinds[j] += result[i][j];
			}
			System.out.print("\n");	
		}


		// 入力された生徒数ぶん繰り返す
		for(int i = 0; i < student; i++) {

			// 生徒ごとに平均点を出す。結果を小数で出したいので型変換。小数点第二位まで表示させる。
			double avg1 = (double)person[i] / subjects.length;
			System.out.print((i + 1) + "人目の平均点は" + String.format("%.2f",avg1) + "点です\n");
			// 生徒ごとの平均点を変数wholeに足しながら入れる
			whole += avg1;
		}
		System.out.print("\n");	


		// 教科数ぶん繰り返す
		for(int i = 0; i < subjects.length; i++) {

			// 教科ごとに平均点を出す。結果を小数で出したいので型変換。小数点第二位まで表示させる。
			double avg2 = (double)kinds[i] / student;
			System.out.print((subjects[i]) + "の平均点は" + String.format("%.2f",avg2) + "点です\n");
		}


		//  全体の平均点を出す。結果を小数で出したいので型変換。小数点第二位まで表示させる。
		double avg3 = (double)whole / student;
		System.out.print("全体の平均点は" + String.format("%.2f",avg3) + "点です\n");
		
		// 【7/26修正】 スキャナーを終了させるためscan.close();を追記
		scan.close();
	}}