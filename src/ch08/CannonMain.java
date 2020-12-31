package ch08;

public class CannonMain {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Weapon weapon = new Weapon();
	System.out.println("기본 무기의 살상 능력은 : " + weapon.fire());
	
	Cannon cannon = new Cannon();
	System.out.println("대포의 살상 능력은 : " + cannon.fire());
	System.out.println("보조 무기의 살상능력은 : " + cannon.fire2());
    }

}
