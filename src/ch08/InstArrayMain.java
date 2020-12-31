package ch08;

public class InstArrayMain {

    public static void main(String[] args) {
	// 객체 배열 만들기
	int[] arr = new int[5]; // 기본 배열 만들기
	int[] arr2 = {1, 2, 3 ,4 ,5}; // 기본 배열 선언 및 데이터 입력
	
//	클래스명[] 변수명 = new 클래스명[크기]; // 객체생성 X 메모리 주소만 생성
	Circle[] c; // Circle 클래스 타입의 배열 변수 c 생성
	c = new Circle[5]; // Circle 클래스 타입의 배열 주소 생성
	
	c[0] = new Circle(); // Circle 클래스 타입의 배열 0번 index에 객체가 생성됨
	
	for (int i = 0; i < c.length; i++) {
	    c[i] = new Circle(); 
	}
	
//	int 타입의 배열 생성
	int[] arr1 = new int[5];
	
//	Circle 타입의 배열 생성
//	Circle 클래스 타입의 객체가 생성이 된 것은 아님
//	Circle 클래스 타입의 배열에는 현재 모두 null이 들어 있음
	Circle[] c1 = new Circle[5];
	
//	Circle 클래스 타입의 객체를 생성
	Circle cir = new Circle();
	
	System.out.println("int 타입의 배열 arr1의 0번 index : " + arr1[0]);
	System.out.println("Circle 클래스 타입의 객체 : " + cir);
	System.out.println("Circle 클래스 타입의 배열 c1의 0번 index : " + c1[0]);
	
	for (int i = 0; i < c1.length; i++) {
	    c1[i] = new Circle(i + 1);
	}
	System.out.println("Circle 클래스 타입의 배열 c1의 0번 index : " + c1[0]);
	
//	Circle 클래스 타입의 배열을 선언과 동시에 객체 5개 생성
	Circle[] c2 = {new Circle(), new Circle(), new Circle(), new Circle(), new Circle()};
	
	System.out.println("Circle 클래스 타입의 배열 c2의 0번 index : " + c2[0]);
	
	System.out.println("\n--------------------\n");
//	클래스 타입의 배열 요소의 멤버에 접근
//	. 을 이용하여 해당 배열의 지정한 index의 멤버에 접근할 수 있음
	
//	배열명[index].멤버명 형식으로 배열 안의 객체의 멤버에 접근
	
	Circle[] c3 = new Circle[5]; // Circle 클래스 타입의 길이가 5인 배열만 생성
//	배열의 각 index에는 내용이 비어있음(null)
//	해당 배열을 사용하려면 각 index에 객체를 생성하는 코드를 입력해야 함
	
	for (int i = 0; i < c3.length; i++) {
	    int result = (int)((Math.random() * 10) + 1);
	    c3[i] = new Circle(result);
	}
	
	System.out.println(c3[0].name);
	System.out.println(c3[0].r);
	c3[0].area();
	
	System.out.println(c3[4].name);
	System.out.println(c3[4].r);
	c3[4].area();
    }

}
