package ch08;

public class ColorPointMain {

    public static void main(String[] args) {
	Point p = new Point();
	p.set(1, 2);
	p.showPoint();
	
//	Point 클래스를 상속받은 ColorPoint 클래스의 객체 cp 생성
	ColorPoint cp = new ColorPoint();
//	Point 클래스에서 상속받은 set() 메서드 사용
	cp.set(3, 4);
//	ColorPoint 클래스 고유의 메서드 setColor, showColorPoint() 메서드를 사용
	cp.setColor("red");
	cp.showColorPoint();

    }

}
