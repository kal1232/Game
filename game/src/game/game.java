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
 
		System.out.println(com);
 
	}	
	
}
