package ch08;

// Point 클래스를 상속받은 ColorPoint 클래스
public class ColorPoint extends Point {
    private String color;
    
//	super() : 부모 클래스를 상속받은 자손 클래스가 객체 생성 시  자동으로 
//    		부모 클래스의 객체를 생성하는 생성자를 호출함
//    	부모 클래스의 생성자를 호출하는 명령어가 super()
//    	자손 클래스의 생성자가 없을 경우 : 컴파일러가 자동으로 자손 클래스의 생성자를 생성,
//    해당 기본 생성자의 첫줄에 자동으로 super()를 입력하여 호출함
    
//    	자손 클래스에 생성자가 있을 경우 : 자손 클래스의 생성자를 호출할 때 컴파일러가 자동으로
//    해당 생성자의 첫줄에 super()를 입력하여 호출
    
//    point 클래스의 멤버 변수 x, y, set(), showPoint 메서드를 상속받아 사용할 수 있음
    public void setColor(String color) {
	this.color = color;
    }
    
    public String getColor() {
	return color;
    }
    
    public void showColorPoint() {
	System.out.println(color);
//	System.out.println(getColor());
	showPoint();
    }
    
    
}
