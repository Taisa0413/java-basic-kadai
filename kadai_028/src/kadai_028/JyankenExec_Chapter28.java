package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main (String[] args) {
		Jyanken_Chapter28 j = new Jyanken_Chapter28();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
	    System.out.println("パーはpaperのpを入力しましょう");
	    
		String myHand = j.getMyChoice();
		String enemyHand = j.getRandom();
		j.playGame(myHand, enemyHand);
		
	}
	
	

}
