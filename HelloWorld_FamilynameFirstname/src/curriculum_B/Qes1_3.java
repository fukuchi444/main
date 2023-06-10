package curriculum_B;

import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

import java.util.Random;

public class Qes1_3 {
	public static void main(String[] args) {
		/* --------------------------------------------------
		 * [概要] 問１ ログイン時の入力チェックシステムを下記条件で作成
		  --------------------------------------------------- */
		System.out.println("問１");

		// 一定の条件が成立するまで、コンソールに繰り返し入力できるようにする
		while (true) {
			Scanner scan1 = new Scanner(System.in);
			String name1 = scan1.nextLine();

			// 文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			if (name1.length() > 10) {
				continue;

				// 文字数が0文字以下か、nullの場合に「名前を入力してください」と出力
			} else if ((name1.length() <= 0) || name1 == null) {
				System.out.println("「名前を入力してください」\n\n");
				continue;

				// 正常な値だった場合、ユーザー名「入力したユーザー名」を登録しました と出力			
			} else {
				System.out.println("ユーザー名「" + name1 + "」を登録しました\n\n");
				break;
			}
		}

		/* --------------------------------------------------------------------
		 * [概要] 問２ 半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		----------------------------------------------------------------------- */
		System.out.println("問２");

		// 一定の条件が成立するまで、コンソールに繰り返し入力できるようにする
		while(true){
			Scanner scan2 = new Scanner(System.in);
			String name2 = scan2.nextLine();

			// 半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
			// 文字列を判定するため、matchesメソッドを使用
			if (name2.matches("^[ぁ-んァ-ヶｱ-ﾝﾞﾟ一-龠]*$")) {
				System.out.println("「半角英数字のみで名前を入力してください\n\n");
				continue;

				// 文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			} else if (name2.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」\n\n");
				continue;

				// 文字数が0文字以下か、nullの場合に「名前を入力してください」と出力
			} else if ((name2.length() <= 0) || name2 == null) {
				System.out.println("「名前を入力してください」\n\n");
				continue;

				// 正常な値だった場合、ユーザー名「入力したユーザー名」を登録しました と出力			
			} else {
				System.out.println("ユーザー名「" + name2 + "」を登録しました\n\n");
				break;
			}
		}


		/* -----------------------------------------------
		 * [概要] 問３ じゃんけんのシステムを指定された条件で作成する
		-------------------------------------------------- */
		System.out.println("問３");

		// ユーザー名を登録するため、「名前を入力してください」と表示させる
		System.out.println("「名前を入力してください」\n\n");

		// 正常なユーザー名を登録するまで、コンソールに繰り返し入力できるようにする
		while (true) {
			Scanner scan3 = new Scanner(System.in);
			String name3 = scan3.nextLine();

			// 半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
			// 文字列を判定するため、matchesメソッドを使用
			if (name3.matches("^[ぁ-んァ-ヶｱ-ﾝﾞﾟ一-龠]*$")) {
				System.out.println("「半角英数字のみで名前を入力してください\n\n");
				continue;

				// 文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			} else if (name3.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」\n\n");
				continue;

				// 文字数が0文字以下か、nullの場合に「名前を入力してください」と出力
			} else if ((name3.length() <= 0) || name3 == null) {
				System.out.println("「名前を入力してください」\n\n");
				continue;

				// 正常なユーザー名の場合、ユーザー名「入力したユーザー名」を登録しました と出力			
			} else {
				System.out.println("ユーザー名「" + name3 + "」を登録しました\n\n");
		}


			// じゃんけんをした回数をカウントする
			int count = 0;
			while (count == count ++) {

				// 選択肢、「0はグー、1：チョキ、2：パー」を表示
				// ユーザーが選択した数字(手)を読み取る
				System.out.println("じゃんけんしよう！数字を入力してね！\n【0:グー 1:チョキ 2:パー】\n");
				Scanner scan4 = new Scanner(System.in);

				// ユーザーが選択した手を、userとする
				// 相手の手はCPUとし、ランダムで表示させるため、Randomメソッドを使用
				int user = scan4.nextInt();
				int CPU = new Random().nextInt(3);

				// ユーザーが選択した手を　「ユーザー名の手は「〇〇」」　と言葉で表示させる
				switch(user) {
				// グーが選択されたとき
				case 0:
					System.out.print(name3 + "の手は「グー」\n");
					break;

					// チョキが選択されたとき
				case 1:
					System.out.print(name3 + "の手は「チョキ」\n");
					break;

					// パーが選択されたとき
				case 2:
					System.out.print(name3 + "の手は「パー」\n");
					break;

					// 上記以外が選択されたとき。もう一度選択肢に戻る
				default:
					System.out.print("ごめん！！0、1、2しか選択肢用意してなかった～～\nでも、無理だよね、3以下のキー燃やしたもんね？\n\n・・・えっ！いける？！　よーし、");
					new Scanner(System.in);
					continue;
				}

				// ランダムで生成する相手の手も、「相手の手は「〇〇」」　と言葉で表示させる
				switch(CPU) {
				case 0:
					System.out.print("相手の手は「グー」\n" ); // グー
					break;
				case 1:
					System.out.print("相手の手は「チョキ」\n"); // チョキ 
					break;
				case 2:
					System.out.print("相手の手は「パー」\n" ); // パー
					break;
				} 

				// 勝ち負けの判定をする
				// ユーザーが勝ったとき。勝つまでかかった合計回数を表示。勝ったらじゃんけんを終了したいのでexitメソッドを使用
				while (true) {
					if((user == 0 && CPU == 1) || (user == 1 && CPU == 2) || (user == 2 && CPU == 0)) {
						System.out.print("\n"); // 改行
						System.out.print("やるやん。\n次は俺にリベンジさせて\n\n勝つまでにかかった合計回数は" + count + "回です\n\n" );
						System.exit(0);
						
						// ユーザーが相手のグーに負けたとき
					} else if(user == 1 && CPU == 0) {
						System.out.print("俺の勝ち！ \n負けは次につながるチャンスです！\nネバーギブアップ！\n\n\n");
						break;

						// ユーザーが相手のチョキに負けたとき
					} else if(user == 2 && CPU == 1) {
						System.out.print("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n\n\n");
						break;
						
						// ユーザーが相手のパーに負けたとき
					} else if(user == 0 && CPU == 2) {
						System.out.print("俺の勝ち！なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n\n\n");
						break;

						// あいこのとき
					} else {
						System.out.print("DRAW あいこ もう一回！！！！\n\n\n");
						break;
					}
				}
			}
		}
	}
}