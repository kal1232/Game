package game;

import java.util.Random;
import java.util.Scanner;

public class game{
	 
	static String rock = "바위";
	static String paper = "보";
	static String scissors = "가위";
	static String com;
	static int myNum;
 
	//가위,바위,보(랜덤으로 나오기)
	public static void getRandomWord(){
 
		String[] RandomPlay = {rock, paper, scissors};
		Random random = new Random();
		int ranNum = random.nextInt(RandomPlay.length);
 
		com = RandomPlay[ranNum];
 
//		System.out.println("com : " + com);
 
	}
	//입력 받는 곳(비교하기)
	public static void inputWord(){
		System.out.println("'가위, 바위, 보' 중 하나를 입력해 주세요.");
		Scanner scan1 = new Scanner(System.in);
		String user = scan1.nextLine();
	
		if(user.equals(rock) && com.equals(rock)
			|| user.equals(paper) && com.equals(paper)
			|| user.equals(scissors) && com.equals(scissors)){
			System.out.println("비겼습니다.");
			System.out.println("나 : " + user + ", 컴퓨터 : " + com);
			System.out.println("내 점수 : " + myNum);
			
		}else if(user.equals(scissors) && com.equals(rock)
				|| user.equals(paper) && com.equals(scissors)
				|| user.equals(rock) && com.equals(paper)){
			System.out.println("졌습니다.");
			System.out.println("나 : " + user + ", 컴퓨터 : " + com);
			loseDecrease();
			System.out.println("내 점수 : " + myNum);
			
	       }else if(user.equals(scissors) && com.equals(paper)
				|| user.equals(paper) && com.equals(rock)
				|| user.equals(rock) && com.equals(scissors)){
			System.out.println("이겼습니다.");
			System.out.println("나 : " + user + ", 컴퓨터 : " + com);
			victoryIncreas();
			System.out.println("내 점수 : " + myNum);
			
	       }else if(user != rock || user != paper || user != scissors){
	    	   System.out.println("다른 값을 입력하셨습니다. 다시 입력해주세요.");
	    	   inputWord();
	       }
		
	 
	}
	//다시 시작 or 끝내기
	public static void reStart(){
		
		System.out.println("다시 시작하려면 '1', 끝내려면 '2'를 눌러주세요.");
		Scanner scan2 = new Scanner(System.in);
		String answer = scan2.nextLine();
		
		if(answer.equals("1")){
			start();
			
		}else if(answer.equals("2")){
			System.out.println("게임이 끝났습니다. 감사합니다.");
			System.out.println("총 점수 : " + myNum);
			
		}else if(!answer.equals("1") || !answer.equals("2")){
			System.out.println("다른 값을 입력하셨습니다. 다시 입력해주세요.");
			reStart();
		}	   
		
	}
	//이겼을 때 점수 더하기
	public static int victoryIncreas(){
		myNum++; 
		return myNum;
	}
	//졌을 때 점수 빼기
	public static int loseDecrease(){
		myNum--;
		return myNum;
	}
	// 코인 기능 
	public static void start(){
		System.out.println("** 코인을 넣어주세요.**");
		System.out.println("* 코인 1개당 1게임 *");
		
		Scanner scan3 = new Scanner(System.in);
		int coin = scan3.nextInt();
		int remainderCoin = coin - 1;
		
		for(int i = 0; i < coin; i++){
			getRandomWord();
			inputWord();
			
			System.out.println("남은 게임 수 : " + remainderCoin--);
//			System.out.println("코인 : " + coin + " | i 값 : " + i );
		}
		
		reStart();
	}
		
	//출력 해주는 부분
	public static void main (String[] args) throws java.lang.Exception{
		start();
	 
	}
	
}
