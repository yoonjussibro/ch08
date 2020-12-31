package ch08;

public class Book3Main {
    
    public static void main(String[] args ) {
//	문제 1) 제목과 저자의 정보를 저장하는 멤버 변수를 가지고 있는 Book3 클래스를 생성하고,
//	사용자로부터 책의 제목과 저자를 입력받아 객체 배열에 저장하고 출력하는 프로그램을 작성하세요
//	조건1. 제목 : title , 저자 : author
//	조건2. Book3 클래스에 생성자를 사용하여 제목과 저자를 입력
//	조건3. 화면 출력은 Book3Main 클래스의 main 메서드에서 println을 통해서 진행
	
//	문제 2) 문제 1번의 Book3 클래스의 내용을 수정하여 Book4 클래스를 생성하고, 멤버 변수인
//	title, author을 외부에서 직접 접근할 수 없도록하고, getter/setter를 이용하여 데이터는 변경할 수 있도록
//	하며, 사용자로부터 책의 정보를 입력받아 객체의 배열에 저장하고 출력하는 프로그램을 작성하세요
//	조건1. getter/setter 사용
//	조건2. 접근제한자 private 사용 
//	조건3. 생성자 오버로딩을 통하여 3개의 생성자를 사용
//	조건4. this() 를 활용
	
	
//	Book3[] bk3 = {new Book3("정의란 무엇인가", "마이클 샌델")};
//	System.out.println("책 제목 : " + bk3[0].title);
//	System.out.println("저자 : " + bk3[0].author);
//	
//	Book3[] bok3;
//	bok3 = new Book3[3];
//	bok3[2] = new Book3("어린왕자", "앙투안");
//	System.out.println("책 제목 : " + bok3[2].title);
//	System.out.println("저자 : " + bok3[2].author);
	
//	Book4[] bk4 = new Book4[4];
//	for (int i = 0; i < bk4.length; i++) {
//	    bk4[i] = new Book4(); 
//	}
//	
//	System.out.println("책 이름 : " + bk4[0].getTitle());
//	System.out.println("저자 : " + bk4[0].getAuthor());
//	System.out.println("\n -------------- \n");
//	
//	bk4[1].setAuthor("황모씨");
//	System.out.println("책 이름 : " + bk4[1].getTitle());
//	System.out.println("저자 : " + bk4[1].getAuthor());
//	System.out.println("\n -------------- \n");
//	
//	bk4[2].setTitle("정의란 무엇인가");
//	bk4[2].setAuthor("마이클 샌델");
//	System.out.println("책 이름 : " + bk4[2].getTitle());
//	System.out.println("저자 : " + bk4[2].getAuthor());
//	System.out.println("\n -------------- \n");
//	
//	bk4[3].setTitle("어린 왕자");
//	bk4[3].setAuthor("앙투안");
//	System.out.println("책 이름 : " + bk4[3].getTitle());
//	System.out.println("저자 : " + bk4[3].getAuthor());
//	System.out.println("\n -------------- \n");
	
	System.out.println("\n -------------- \n");

	
//	문자열은 문자의 배열임
//	C언어에서는 문자열을 char 타입 배열로 선언해서 사용함
	String str = "안녕하세요";
	System.out.println(str.length());
//	charAt(index) : 해당 문자열의 index에 해당하는 글자를 가져옴
	
 
	char num1 = str.charAt(0);
	System.out.println(num1);
	
	
    }
    
//    문제 3) 사용자 입력을 받아서 끝말잇기 프로그램을 작성하세요
//    조건 1. 처음 사용하는 단어는 '아버지'를 사용
//    조건 2. 2개의 클래스가 필요 Player, WordGame
//    조건 3. 끝말잇기가 실패 시 화면에 '끝말잇기 실패' 라는 메세지를 띄우고 프로그램 종료
    
}
