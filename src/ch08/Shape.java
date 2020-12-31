package ch08;

public class Shape {
    public Shape next;
    public Shape() {
	next = null;
    }
    
//    자손 클래스가 오버라이딩을 진행할 메서드
    public void draw() {
	System.out.println("Shape");
    }
}
