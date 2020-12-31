package ch08;

public class MethodOverridingMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Shape s = new Shape();
	s.draw();
	
	Line l = new Line();
	Rect r = new Rect();
	
	l.draw();
	r.draw();
	
//	오버라이딩 사용 시 부모 클래스의 메서드의 원형을 사용해야 하기
//	때문에 자식 클래스에서 메서드의 사용 방법을 강제로 지정할 수 있게 됨
	
	Line line = new Line();
	
	paint(new Shape());
	paint(line);
//	클래스의 다형성 때문에 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장할 수 있음
	paint(new Rect());
	paint(new Line());
	
    }
    
    public static void paint(Shape p) {
	p.draw();
    }

}
