package kadai_028;

import java.util.Scanner;
import java.util.Random;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力
	public String getMyChoice() {
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.print("自分の手を入力してください:");
			String hand = sc.next().trim().toLowerCase();
			
			if (hand.equals("r") || hand.equals("s") ||hand.equals("p")) {
				return hand;
			}else {
				System.out.println("エラー：r,s,p のいずれかを入力してください。");
			}
		}
	}
	
	//相手の手を乱数で選ぶ
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int index = (int) Math.floor(Math.random() * hands.length);
		return hands[index];
	}
	
	//日本語変換
	private String toJa(String h) {
		switch (h) {
		case "r": return "グー";
		case "s": return "チョキ";
		case "p": return "パー";
		default: return "?";
		}
	}
	
	//勝敗判定と結果
	public void playGame(String myHand, String enemyHand) {
		System.out.println("自分の手は" + toJa(myHand));
		System.out.println("相手の手は" + toJa(enemyHand));
		
		if (myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		}else if (
				(myHand.equals("r") && enemyHand.equals("s"))||
				(myHand.equals("s") && enemyHand.equals("p"))||
				(myHand.equals("p") && enemyHand.equals("r"))
				) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}

}
