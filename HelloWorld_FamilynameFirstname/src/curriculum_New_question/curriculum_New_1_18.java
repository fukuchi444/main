package curriculum_New_question;
import java.util.Random;


public class curriculum_New_1_18 {
	/* ------------------------------------------------------------------------------
	 * [概要] Q1: 引数に配列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成
	   ------------------------------------------------------------------------------ */
	public static void hello(String words, int num) {
		System.out.println( words + " " + num);
	}


	/* ------------------------------------------------------------------------------
	 * [概要] Q2: 引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成
	   ------------------------------------------------------------------------------ */
	public static void calc(int num1, int num2) {
		int sum = num1 * num2;
		System.out.println(sum);
	}


	/* ------------------------------------------------------------------------------
	 * [概要] Q3： 引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成
	   ------------------------------------------------------------------------------ */
	public static void array(int[] num) {
		for(int i = 0; i < num.length; i++){
			System.out.println(num[i]);
		}
	}


	/* ------------------------------------------------------------------------------
	 * [概要] Q4: Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
	   ------------------------------------------------------------------------------ */
	public static void calc(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}


	/* ------------------------------------------------------------------------------
	 * [概要] Q5: 引数に整数を渡すと、1～100までの乱数を引数の回数分格納し、値を順番に出力
	 * 			  格納した値を返すメソッドを作成。  ※0は出力＆格納しない
	   ------------------------------------------------------------------------------ */
	public static int[] repeat(int num) {

		// 引数分の配列を用意
		int[] value = new int[num];

		// 乱数を生成させる
		Random ran = new Random();

		// 配列の中に乱数を格納。引数分繰り返す
		for(int i = 0; i < value.length; i++){
			value[i] = ran.nextInt(101) + 1;
		}

		// 値(乱数)を表示させる
		for (int reflect : value){
			System.out.println(reflect);
		}
		// 格納した値(乱数)を返す
		return  value;
	}
 

	/* ------------------------------------------------------------------------------
	 * [概要] Q6: 引数にQ5で作成したメソッドの返り値を受け取り、
				  受け取った配列の要素の平均値を出力するメソッドを作成 ※小数点以下も表示する
	   ------------------------------------------------------------------------------ */
	public static double average(int[] array) {

		// 受け取った配列(Q5)の要素を合計するための変数。小数点以下も表示させるのでdouble型
		double sum = 0.0;

		// 配列(Q5)の要素の数ぶん足す
		for(int reflect : array){
			sum += reflect;
		}

		// 平均値を出すため、合計した値をを要素数で割る
		double avg = (double)sum/ (double)array.length;
		System.out.println(avg);

		// 平均値を返す
		return avg;
	}



	/* ------------------------------------------------------------------------------
	 * [概要] Q7： 引数にQ6で作成したメソッドの返り値を受け取り、
  			      受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力
	   ------------------------------------------------------------------------------ */
	public static void over(double avg) {
		// 受け取った値が50以上ならばtrueと出力
		if(avg >= 50) {
			System.out.println("true");
			
		// 上記以外はfalseと出力
		} else {
			System.out.println("false");
		}
	}


	// ↓↓↓↓ 作成したメソッドはここで呼び出す ↓↓↓↓
	public static void main(String[] args) {

		// Q1: 「Hello JavaSE 11」 と出力する
		System.out.println("Ｑ１");
		hello("Hello JavaSE", 11);
		System.out.println("\n");


		// Q2: 引数に整数を渡すと渡した値同士を乗算して出力する
		System.out.println("Ｑ２");
		calc(7, 2);
		System.out.println("\n");


		// Q3: 引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力する
		System.out.println("Ｑ３");
		int num[] = {10, 4, 6, 8};
		array(num);
		System.out.println("\n");


		// Q4: Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算し出力する
		System.out.println("Ｑ４");
		calc(5.5, 3.0);
		System.out.println("\n");


		// Q5: 引数に整数を渡すと、1～100までの乱数を引数の回数分格納し出力。格納した値を返す
		System.out.println("Ｑ５");
		repeat(8);
		System.out.println("\n");


		// Q6: 引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値を出力する
		System.out.println("Ｑ６");
		int array[]  = repeat(8);
		average(array);
		System.out.println("\n");


		// Q7: 引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返し出力
		System.out.println("Ｑ７");
		double answer = average(array);
		over(answer);
		System.out.println("\n");

	}
}