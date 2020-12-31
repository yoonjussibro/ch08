package ch08;

import java.util.Scanner;


public class Game {
    
    private Scanner sc;
    private String startWord;
    
    public Game() {
	startWord = "아버지";
	sc = new Scanner(System.in);
    }
    
    public void run() {
	System.out.println("끝말잇기 시작");
	System.out.println("시작 단어 '" + startWord + "'입니다.");
	
	String lastWord = startWord;
	    
	System.out.println("시작 >" + startWord);
	
	while(true) {
	    System.out.print("입력 > ");
	    startWord = sc.next();
	    
	    if (checkWord(lastWord) == true) {
		System.out.println("출력 > " + startWord);
		
		lastWord = startWord;
	    }   
	    else {
		System.out.println("끝말잇기가 실패");
		break;
	    }
	}
	System.out.println("프로그램 종료");	
    }
    public boolean checkWord(String lastWord) {
	int lastIndex = lastWord.length() - 1;
	
	if (lastWord.charAt(lastIndex) == startWord.charAt(0)) {
	    return true;
	}
	
	else {
	    return false;
	}
    }
    
    
}
