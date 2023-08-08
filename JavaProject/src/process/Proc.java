package process; // 処理用

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Proc {
	/* -----------------------------------------------------
	 * [概要] 下記条件に沿って、指定の文言(行34～37)が出力されるようにする
	 * 
	 * 【条件】 
		・JavaProjectを新規作成し、実行用と処理用のpackageを作成
		・適切なファイルに、フィールド上で必要な分の変数を定義
		・thisを使用
		・現在の日時を取得
	 ----------------------------------------------------- */

	// フィールドに変数を定義
	public String location;
	public String delicious;
	public String food;
	public String current;

	// nullチェック用の変数
	String check = null;

	// カレンダークラスを呼び出す
	Calendar now = Calendar.getInstance();
	// 表示する日時の形式を指定する
	SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd H:m:s");


	// コンストラクタを作成
	public Proc() {
		this.location = "こんにちは！ここは日本です！";
		this.delicious = "この寿司はうまい";
		this.food = "寿司は和食です";
		this.current = "今の現在日時は" + date.format(now.getTime()) + "です";


		// もしnullの場合は。nullと表示する
		if(location.equals(check) || delicious.equals(check) || food.equals(check) || current.equals(check)) {
			System.out.println(check);
		}
	}}
