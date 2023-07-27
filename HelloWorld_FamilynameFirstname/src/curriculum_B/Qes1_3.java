package curriculum_B;

import java.util.Scanner;


import java.util.Random;

public class Qes1_3 {
	public static void main(String[] args) {

		/* ---------------------------------------------------------------
		 * [概要] 
		 * 問１ ログイン時の入力チェックシステムを作成
		 * 問２ 半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		 * 問３ じゃんけんのシステムを指定された条件で作成する
		------------------------------------------------------------------ */
		System.out.println("問１～３");

		// ユーザー名を登録するため、「名前を入力してください」と表示させる
		System.out.println("「名前を入力してください」");

		// 正常なユーザー名を登録するまで、コンソールに繰り返し入力できるようにする
		while (true) {
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();

			// 半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
			// 文字列を判定するため、matchesメソッドを使用

			// 【7/24　修正】 日本語の正規表現を"^[ぁ-んーァ-ヶー一-龠]+$"から下記へ変更し、日本語が入っていると登録できないよう修正
			if (name.matches(".*[ぁ-んーァ-ヶー一-龠].*")) {
				System.out.println("「半角英数字のみで名前を入力してください\n\n");
				continue;

				// 文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			} else if (name.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」\n\n");
				continue;

				// 文字数が0文字以下か、nullの場合に「名前を入力してください」と出力
			} else if ((name.length() <= 0) || name == null) {
				System.out.println("「名前を入力してください」\n\n");
				continue;

				// 正常なユーザー名の場合、ユーザー名「入力したユーザー名」を登録しました と出力			
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました\n\n");	
			}



			// じゃんけんをした回数をカウントする
			int count = 0;
			while (count == count ++) {

				// 選択肢、「0はグー、1：チョキ、2：パー」を表示
				// ユーザーが選択した数字(手)を読み取る
				System.out.println("じゃんけんしよう！数字を入力してね！\n【0:グー 1:チョキ 2:パー】\n");

				// ユーザーが選択した手を、userとする
				// 相手の手はCPUとし、ランダムで表示させるため、Randomメソッドを使用
				
				// 【7/26修正】 scan2.nextInt();を削除。スキャナーを統一するため、scan.nextInt();に変更
				int user = scan.nextInt();
				int CPU = new Random().nextInt(3);

				// ユーザーが選択した手を　「ユーザー名の手は「〇〇」」　と言葉で表示させる
				switch(user) {
				// グーが選択されたとき
				case 0:
					System.out.print(name + "の手は「グー」\n");
					break;

					// チョキが選択されたとき
				case 1:
					System.out.print(name + "の手は「チョキ」\n");
					break;

					// パーが選択されたとき
				case 2:
					System.out.print(name + "の手は「パー」\n");
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
			scan.close();
		}
	}
}