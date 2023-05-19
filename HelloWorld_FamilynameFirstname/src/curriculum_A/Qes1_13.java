package curriculum_A;
public class Qes1_13 {
	public static void main(String[] args){
/* --------------------------------------------------------------
 * [概要] 問１ ローカル変数として宣言のみ行う
 * 
   【5/16　修正点】　コメントアウトではなく｛｝の中に記載。分かりやすい変数名に変更
  　-------------------------------------------------------------- */
			// バイト型
			byte by;
						
			// 短整数型
			short sh;
			
			// 整数型
			int in;
			
			// 長整数型
			long  lo;
			
			// 単精度浮動小数点数型
			float fl;
			
			// 倍精度浮動小数点数型
			double dou;
			
			// 文字型
			char ch;
			
			// 文字列型
			String st;
			
			// ブーリアン型
			boolean bo;
			
		
/* ---------------------------------------------------------------
 * [概要] 問２ ローカル変数をローカル内で、初期値を代入して初期化する
 * 
   【5/16　修正点】　宣言ではなく、変数に値を代入。長整数型、正しい初期値に訂正
 　---------------------------------------------------------------- */			
			// バイト型 (byte)
			by = 0;
			
			// 短整数型 (short)
			sh = 0;
			
			// 整数型 (int)
			in = 0;
			
			// 長整数型 (long)
			lo = 0L;
			
			// 単精度浮動小数点数型 (float)
			fl = 0.0f;
			
			// 倍精度浮動小数点数型 (double)
			dou = 0.0d;
			
			// 文字型　(char)
			ch = '\u0000';
			
			// 文字列型 (String)
			st = null;
			
			// ブーリアン型 (boolean)
			bo = false;
			
			
/* -----------------------------------------------------------
 * [概要] 問３ 初期化した変数に指定された値を代入する
 *  
   【5/16　修正点】　81行目のintを半角に変更。85行目の値の末尾にLを追記 
  ------------------------------------------------------------ */
			// バイト型 (byte)
			by = 10;
			
			// 短整数型 (short)
			sh = 100;
			
			// 整数型 (int)
			in = 1000;
			
			// 長整数型 (long)
			lo = 10000L;
			
			// 単精度浮動小数点数型 (float)
			fl = 9.5f;
			
			// 倍精度浮動小数点数型 (double)
			dou = 10.5d;
			
			// 文字型　(char)
			ch = 'a';
			
			// 文字列型 (String)
			st = "ハロー";
			
			// ブーリアン型 (boolean)
			bo = true;
			
			System.out.print("\n"); // 改行
			
			
/* -----------------------------------------------------------
 * [概要] 問４　問３の変数を必ず使用し、コンソール出力する
 * 
   【5/16　修正点】 117行目。出力時、単語ごとにスペースが入るよう" "を追記
  ------------------------------------------------------------ */
			String title4 = "問４";
			System.out.println(title4);
			
			// 11110
			System.out.println(by + sh + in + lo);
			
			// 20
			System.out.println(by + by);
			
			// a ハロー true
			System.out.println(ch + " " +  st  + " " + bo);
			
			// 11130 （数字を全て足す） 
			System.out.println(by + sh + in + lo + fl + dou);
			
			// 10000000000 （小数点以外の数字を全てかける）
			System.out.println(by * sh * in * lo);
			
			// 0.105 （10.5割る100をする）
			System.out.println(dou / 100);
			
			// -90 （10引く100をする）
			System.out.println(by - 100);
		
			System.out.print("\n"); // 改行
			
			
/* ----------------------------------------------------
 * [概要] 問５　実行結果が「ハローJAVA2023」と表示されるプログラムを、
 *   　　　　「ハローJAVA43」と表示されるよう修正する
 *   
	【5/16　修正点】　コメントアウトにて修正内容を追記
 ------------------------------------------------------ */
			String title5 = "問５";
			System.out.println(title5);
			
			// 数字どうしで和算されるよう、変数numをStringからintに変更
			int num = 20;
			int num1 = 23;
			System.out.println("ハローJAVA" + (num + num1));
			
			System.out.print("\n"); // 改行
			
			
/* -------------------------------------------------------
 * [概要] 問６　下記個人情報を変数にし、format文の〇〇内に代入する
 *		  『山田太郎 18歳 170.5cm 62.2kg 寿司』	　　　
   ------------------------------------------------------- */
			String title6 = "問６";
			System.out.println(title6);
			
			// 「初めまして○○です」
			String name = "山田太郎";
			System.out.println("初めまして" + name + "です");
			
			// 「年齢は○○歳です」
			int age = 18;
			System.out.println("年齢は" + age + "歳です");
			
			// 「身長は○○cmです」
			double height = 170.5d;
			System.out.println("身長は" + height + "cmです");
			
			// 「体重は○○kgです」
			double weight = 62.2d;
			System.out.println("体重は" + weight + "kgです");
			
			// 「好きな食べ物は○○です」
			String eat = "寿司";
			System.out.println("好きな食べ物は" + eat + "です");
			
			System.out.print("\n"); // 改行
			
			
/* ----------------------------------------------
 * [概要] 問７　問６の自己紹介文に続き、BMIを出力する
 *
   【5/19　修正点】 身長の単位をcm → mに変更し計算。
 　----------------------------------------------- */
			String title7 = "問７";
			System.out.println(title7);
			
			// 「BMIは○○です」
			height /= 100;
			double bmi = weight / (height * height);
			System.out.println("BMIは" + String.format("%.1f",bmi )+ "です");
			
			System.out.print("\n"); // 改行
			
			
/* --------------------------------------------------
 [概要] 問８　問６で宣言した変数に再代入し、下記の通り出力する
 
  【5/19　修正点】 231行目、直接数値を入力して計算
 ---------------------------------------------------- */
			String title8 = "問８";
			System.out.println(title8);
			
			// 初めまして鈴木一郎です
			name = "鈴木一郎";
			System.out.println("初めまして" + name + "です");
			
			// 年齢は24歳です
			age = 24;
			System.out.println("年齢は" + age + "歳です");
			
			// 身長168.5cmです
			height = 168.5d;
			System.out.println("身長は" + height + "cmです");
			
			// 体重は64.2kgです
			weight = 64.2d;
			System.out.println("体重は" + weight + "kgです");
			
			// 好きな食べ物はオムライスです
			eat = "オムライス";
			System.out.println("好きな食べ物は" + eat + "です");
			
			// BMIは22.6です
			bmi = 64.2d / (1.685d * 1.685d);
			System.out.println("BMIは" + String.format("%.1f",bmi )+ "です");
			
			System.out.print("\n"); // 改行
			
			
/* ------------------------------------------
 [概要] 問９　問８の変数【年齢・身長・体重】の数値を
 			和算で自己代入し、下記の通り出力する
 			
 【5/19　修正点】 270行目、直接数値を入力して計算
 -------------------------------------------- */
			String title9 = "問９";
			System.out.println(title9);
			
			// 初めまして鈴木一郎です
			name = "鈴木一郎";
			System.out.println("初めまして" + name + "です");
			
			// 年齢は48歳です
			int age2 = 24;
			age = age + age2;
			System.out.println("年齢は" + age + "歳です");
			
			// 身長337.0cmです
			double height2 = 168.5d;
			height = height + height2;
			System.out.println("身長は" + height + "cmです");
			
			// 体重は128.4kgです
			double weight2 = 64.2d;
			weight = weight + weight2;
			System.out.println("体重は" + weight + "kgです");
			
			// 好きな食べ物はオムライスです
			eat = "オムライス";
			System.out.println("好きな食べ物は" + eat + "です");
			
			// BMIは11.31です
			bmi = 128.4d / (3.370d * 3.370d);
			System.out.println("BMIは" + String.format("%.2f",bmi )+ "です");
			
			System.out.print("\n"); // 改行
			
			
/* -------------------------------------------------
 [概要] 問１０　問８で使用した年齢が25歳以上ならtrueと出力する
			　（ｉｆ文不可）
 --------------------------------------------------- */
			String title10 = "問１０";
			System.out.println(title10);
			
			// 問８で使用した年齢：24歳
			age = 24;
			System.out.println((age >= 25));
			
			System.out.print("\n"); // 改行
			
			
/* --------------------------------------------------------
 [概要] 問１１　問８で使用した下記を文字列型に型変換し、繋げて出力する			　
 			 【年齢・身長・体重】 (24歳・168.5cm・64.2kg)
 ---------------------------------------------------------- */
			String title11 = "問１１";
			System.out.println(title11);
			
			height = 168.5;
			weight = 64.2;
			String age11 = String.valueOf(age);
			String height11 = String.valueOf(height);
			String weight11 = String.valueOf(weight);
			System.out.println(age11 + height11 + weight11);
			
			System.out.print("\n"); // 改行
			
			
/* -------------------------------------------------------
 [概要] 問１２　問１１で変換した【年齢・身長】を整数型に変換し、出力する			　
 ---------------------------------------------------------　*/
			String title12 = "問１２";
			System.out.println(title12);
			
			// 問１１で変換した年齢・身長：24歳・168.5cm
			Integer age12 = Integer.valueOf(age11);
			Double height12 = Double.valueOf(height11);
			System.out.println(age12);
			System.out.println(height12);
			
			System.out.print("\n"); // 改行
			
			
/* ---------------------------------------------------------------
 [概要] 問１３　問１２で変換した　【年齢・身長】で、
 			【年齢が25もしくは身長が160以上】であればtrueを出力する（ｉｆ文不可）
 ----------------------------------------------------------------- */
			String title13 = "問１３";
			System.out.println(title13);
			
			// 問１２で変換した年齢・身長：24歳・168.5cm
			System.out.println((age12 >= 25) || (height12 >= 160));
			
			System.out.print("\n"); // 改行
		}
	}		