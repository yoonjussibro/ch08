package ch08;

import java.util.Scanner;

public class WordGame2 {
//    private java.util.Scanner sc1;
    private Scanner sc;
    private String startWord; // 시작단어
    private Player[] players; // 참가자를 저장하기 위한 Player 클래스의 배열
    
    public WordGame2() {
	sc = new Scanner(System.in);
	startWord = "아버지";
    }
    
//    사용자가 입력한 사람수대로 플레이어를 생성
    private void createPlayers() {
	System.out.println("게임에 참가하는 인원을 입력하세요 > ");
	
//	사용자 입력을 통해 참가자 수를 정함
	int nPlayer = sc.nextInt();
//	players 는 참가자를 저장하기 위한 Player의 클래스의 배열
//	new Player[크기]; 를 통해서 배열의 크기를 설정
	players = new Player[nPlayer]; // 배열 생성, 각각의 요소의 객체는 아직 생성되지 않음
	
//	for 문을 사용하여 players 배열의 각각의 요소에 Player 클래스 타입의 객체를 생성
	for (int i = 0; i < nPlayer; i++) {
	    System.out.print("참가자의 이름을 입력하세요 > ");
	    
//	    사용자 이름 입력
	    String name = sc.next();
//	    입력 받은 이름을 생성자의 매개변수로 사용하여 객체를 생성
	    players[i] = new Player(name);
	}
    }
    
    public void run() {
	System.out.println("끝말잇기 게임을 시작합니다.");
	createPlayers();
	String lastWord = startWord;
	
	System.out.println("시작하는 단어는 '" + lastWord + "'입니다.");
	int next = 0;
	
//	무한 반복, 끝말잇기가 틀릴 때까지
	while (true) {
//	    Player 타입의 배열인 players[index] 요소의 멤버 메서드 getUserWord를 호출
//	    지정된 요소의 멤버 변수 name을 화면에 출력하고 사용자의 단어 입력을 기다림
//	    사용자가 단어를 입력하면 해당 요소의 멤버 변수인 word에 저장하고 저장된 단어를 반환함
//	    반환된 단어를 newWord에 다시 저장
//	    해당 사람에게 새 단어를 입력함
	    String newWord = players[next].getUserWord();
	    
//	    lastWord는 위에서 lastWord = startWord를 하였기 때문에 이전의 단어가 저장되어 있음
	    if (players[next].checkWord(lastWord) == false) {
		System.out.println(players[next].getName() + "이 졌습니다.");
		break;
	    }
	    next++;
	    next %= players.length; // next가 참가자의 수보다 많게 증가하는 것을 막음
	    if (next >= players.length) {
		next = 0;
	    }
	    lastWord = newWord;
	}
    }
}
