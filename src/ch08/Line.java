package ch08;

// Shape 클래스를 상속받은 Line 클래스
public class Line extends Shape {
    @Override
    public void draw() {
	System.out.println("Line");
    }

}
