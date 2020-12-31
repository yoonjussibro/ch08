package ch08;

public class Child extends Parent{
    public Child() {
//	컴파일러가 자동으로 생성한 부모 클래스의 생성자를 호출하는 super()가 존재하여
//	부모 클래스의 생성자를 호출함
	
//	super()
	super("부모 클래스 호출하는 super()");
	System.out.println("자식 클래스의 생성자");
    }
}
