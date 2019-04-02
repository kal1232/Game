package game;

import java.util.Random;
import java.util.Scanner;

public class game{
	 
	static String rock = "바위";
	static String paper = "보";
	static String scissors = "가위";
	static String com = "";
 
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
		Scanner scan = new Scanner(System.in);
		String user = scan.nextLine();
	
		if(user.equals(rock) && com.equals(rock)
			|| user.equals(paper) && com.equals(paper)
			|| user.equals(scissors) && com.equals(scissors)){
			System.out.println("비겼습니다.");
			System.out.println("나 : " + user + ", 컴퓨터 : " + com);
		}else if(user.equals(scissors) && com.equals(rock)
				|| user.equals(paper) && com.equals(scissors)
				|| user.equals(rock) && com.equals(paper)){
			System.out.println("졌습니다.");
			System.out.println("나 : " + user + ", 컴퓨터 : " + com);
	       }else if(user.equals(scissors) && com.equals(paper)
				|| user.equals(paper) && com.equals(rock)
				|| user.equals(rock) && com.equals(scissors)){
			System.out.println("이겼습니다.");
			System.out.println("나 : " + user + ", 컴퓨터 : " + com);
	       }else if(user != rock || user != paper || user != scissors){
	    	   System.out.println("다른 값을 입력하셨습니다. 다시 입력해주세요.");
	    	   inputWord();
	       }
		
	 
	}
	public static void reStart(){
		System.out.println("다시 시작하려면 '1', 끝내려면 '2'를 눌러주세요.");
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		
		if(answer.equals("1")){
			start();
		}else if(answer.equals("2")){
			System.out.println("게임이 끝났습니다. 감사합니다.");
		}else if(!answer.equals("1") || !answer.equals("2")){
			System.out.println("다른 값을 입력하셨습니다. 다시 입력해주세요.");
		}	   
		
		
	}
	public static void start(){
		getRandomWord();
		inputWord();
		reStart();
	}
		
	//출력 해주는 부분
	public static void main (String[] args) throws java.lang.Exception{
		start();
	 
	}
	
}
