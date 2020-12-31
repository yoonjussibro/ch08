package ch08;

public class Cannon extends Weapon{
    @Override
    protected int fire() {
	return 10;
    }
    
    public int fire2() {
	return super.fire();
    }
}
