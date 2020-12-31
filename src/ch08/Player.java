package ch08;

import java.util.Scanner;

public class Player {
    private Scanner sc; // 사용자 키보드 입력
    private String name; // 게임 참가자 이름
    private String word; // 참가자가 말한 단어
    
    public Player(String name) {
	this.name = name; // 멤버 변수에 이름 저장
	sc = new Scanner(System.in); 
    }
    
//    클래스의 멤버 변수는 외부에서 직접 접근하는 것이 좋지 않음
//    getter를 사용하여 입력된 사용자의 이름을 대신 가져옴
    public String getName() {
	return name;
    }
    
//    게임 참가자가 말한 단어를 입력받는 메서드
    public String getUserWord() {
	System.out.print(name + " > ");
	word = sc.next(); // 사용자가 입력한 내용을 멤버 변수에 저장
	return word;
    }
    
//    매개변수로 이전 사람의 단어를 가지고 와서 현재 사람의 단어와 비교
    public boolean checkWord(String lastWord) {
	boolean result = false; // 결과, 기본값 false
	int lastIndex = lastWord.length() - 1;
	
//	charAt(index) 메서드는 해당 문자열의 index 번째의 글자 1개를 반환(char 타입으로 반환)
//	char 타입은 정수형 데이터 타입, 비교 연산자로 정확한 비교 가능
	
	if (lastWord.charAt(lastIndex) == word.charAt(0)) {
	    result = true;
	}
	
	return result;
    }
}
