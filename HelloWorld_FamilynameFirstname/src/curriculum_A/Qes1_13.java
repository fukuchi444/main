/* ----------------------------------
  [概要] 問１ ローカル変数として宣言のみ行う 
  ----------------------------------- 
			// バイト型
			byte a;
						
			// 短整数型
			short b;
			
			// 整数型
			int c;
			
			// 長整数型
			long  d;
			
			// 単精度浮動小数点数型
			float e;
			
			// 倍精度浮動小数点数型
			double f;
			
			// 文字型
			char g;
			
			// 文字列型
			String h;
			
			// ブーリアン型
			boolean i;
										*/
			
		
/* -----------------------------------------------------
 [概要] 問２ ローカル変数をローカル内で、初期値を代入して初期化する
 ------------------------------------------------------- */
package curriculum_A;
	public class Qes1_13 {
		public static void main(String[] args){
			
			// バイト型
			byte a = 0;
			
			//短整数型
			short b = 0;
			
			// 整数型
			int c = 0;
			
			// 長整数型
			long d = 0;
			
			// 単精度浮動小数点数型
			float e = 0.0f;
			
			// 倍精度浮動小数点数型
			double f = 0.0d;
			
			// 文字型
			char g = '\u0000';
			
			// 文字列型
			String h = null;
			
			// ブーリアン型 
			boolean i = false;
			
			
/* ------------------------------------------
 [概要] 問３ 初期化した変数に指定された値を代入する 
 -------------------------------------------- */
			// バイト型 (byte)
			a = 10;
			
			//短整数型 (short)
			b = 100;
			
			// 整数型 (ｉｎｔ)
			c = 1000;
			
			// 長整数型 (long)
			d = 10000;
			
			// 単精度浮動小数点数型 (float)
			e = 9.5f;
			
			// 倍精度浮動小数点数型 (double)
			f = 10.5d;
			
			// 文字型　(char)
			g = 'a';
			
			// 文字列型 (String)
			h = "ハロー";
			
			// ブーリアン型 (boolean)
			i = true;
			
			
/* -------------------------------------------
 [概要] 問４　問３の変数を必ず使用し、コンソール出力する 
 --------------------------------------------- */
			//11110
			System.out.println(a + b + c + d);
			
			//20
			System.out.println(a + a);
			
			//a ハロー true
			System.out.println(g + h + i);
			
			//11130 （数字を全て足す） 
			System.out.println(a + b + c + d + e + f);
			
			//10000000000 （小数点以外の数字を全てかける）
			System.out.println(a * b * c * d);
			
			//0.105 （10.5割る100をする）
			System.out.println(f / 100);
			
			//-90 （10引く100をする）
			System.out.println(a - 100);
		
			
/* ---------------------------------------------------
 [概要] 問５　実行結果が「ハローJAVA2023」と表示されるプログラムを、
 	　　　「ハローJAVA43」と表示されるよう修正する
 ----------------------------------------------------- */
			int num = 20;
			int num1 = 23;
			System.out.println("ハローJAVA" + (num + num1));
			
			
/* ------------------------------------------------------
 [概要] 問６　下記個人情報を変数にし、format文の〇〇内に代入する
			 『山田太郎 18歳 170.5cm 62.2kg 寿司』	　　　
  ------------------------------------------------------- */
			//「初めまして○○です」
			String name = "山田太郎";
			System.out.println("初めまして" + name + "です");
			
			//「年齢は○○歳です」
			int age = 18;
			System.out.println("年齢は" + age + "歳です");
			
			//「身長は○○cmです」
			double height = 170.5d;
			System.out.println("身長は" + height + "cmです");
			
			//「体重は○○kgです」
			double weight = 62.2d;
			System.out.println("体重は" + weight + "kgです");
			
			//「好きな食べ物は○○です」
			String eat = "寿司";
			System.out.println("好きな食べ物は" + eat + "です");
			
			
/* -----------------------------------------
 [概要] 問７　問６の自己紹介文に続き、BMIを出力する
 ------------------------------------------- */
			//「BMIは○○です」
			height = Math.pow(170.5, 2);
			double bmi = ((double)Math.round(weight / (height / 10000) * 100))/100;
			System.out.println(String.format("BMIは" + bmi + "です"));
			
			
/* -------------------------------------------------
 [概要] 問８　問６で宣言した変数に再代入し、下記の通り出力する
 --------------------------------------------------- */
			//初めまして鈴木一郎です
			name = "鈴木一郎";
			System.out.println("初めまして" + name + "です");
			
			//年齢は24歳です
			age = 24;
			System.out.println("年齢は" + age + "歳です");
			
			//身長168.5cmです
			height = 168.5d;
			System.out.println("身長は" + height + "cmです");
			
			//体重は64.2kgです
			weight = 64.2d;
			System.out.println("体重は" + weight + "kgです");
			
			//好きな食べ物はオムライスです
			eat = "オムライス";
			System.out.println("好きな食べ物は" + eat + "です");
			
			//BMIは22.6です
			height = Math.pow(168.5, 2);
			bmi = ((double)Math.round(weight / (height / 10000) * 10))/10;
			System.out.println(String.format("BMIは" + bmi + "です"));
			
			
/* ----------------------------------------
 [概要] 問９　問８の変数【年齢・身長・体重】の数値を
 			和算で自己代入し、下記の通り出力する
 ------------------------------------------ */
			//初めまして鈴木一郎です
			name = "鈴木一郎";
			System.out.println("初めまして" + name + "です");
			
			//年齢は48歳です
			int age2 = 24;
			age = age + age2;
			System.out.println("年齢は" + age + "歳です");
			
			//身長337.0cmです!!!!!!!!!!おかしい
			double height2 = 168.5d;
			height = height + height2;
			System.out.println("身長は" + height + "cmです");
			
			//体重は128.4kgです
			double weight2 = 64.2d;
			weight = weight + weight2;
			System.out.println("体重は" + weight + "kgです");
			
			//好きな食べ物はオムライスです
			eat = "オムライス";
			System.out.println("好きな食べ物は" + eat + "です");
			
			//BMIは11.31です
			height = Math.pow(337.0, 2);
			bmi = ((double)Math.round(weight / (height / 10000) * 10))/10;
			System.out.println(String.format("BMIは" + bmi + "です"));
		}
	}
	
