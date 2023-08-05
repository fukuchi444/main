package basicClass;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Animal {
	public static void main(String[] args) {
		/* -----------------------------------------------------------------------
		 * [概要] Q1: Dogクラスを呼び出して変数に代入。動物の名前をコンソールに出力する
		   ----------------------------------------------------------------------- */
		System.out.println("Ｑ１");
		// Dogクラスを呼び出す
		Dog animal_name = new Dog();

		// 動物名、"わんこ"を変数に代入
		animal_name.dog1 = "わんこ" ;

		// "わんこ"を出力する
		System.out.println(animal_name.dog1);
		System.out.println("\n");
		
		
		
		/* -----------------------------------------------------------------------
		 * [概要] Q2： Dogクラスを呼び出して変数に代入。動物の数をコンソールに出力する
		   ----------------------------------------------------------------------- */
		System.out.println("Ｑ２");
		// Dogクラスを呼び出す
		Dog animal_num = new Dog(5);

		// 5を出力する
		System.out.println(animal_num.dog2);
		System.out.println("\n");
		
		
		
		/* -----------------------------------------------------------------------
		 * [概要] Q3: 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入。コンソールに出力する
		   ----------------------------------------------------------------------- */
		System.out.println("Ｑ３");
		// カレンダークラスを呼び出す
		Calendar now = Calendar.getInstance();

		// 表示する日時の形式を指定する
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 日時を表示する
		System.out.println(date.format(now.getTime()));
		System.out.println("\n");
	}
}