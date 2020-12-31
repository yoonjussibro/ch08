package ch08;

// Shape 클래스를 상속받은 Rect 클래스
public class Rect extends Shape {
    @Override
    public void draw() {
	System.out.println("Rect");
    }
}
