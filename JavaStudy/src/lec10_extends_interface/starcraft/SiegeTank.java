package lec10_extends_interface.starcraft;

public class SiegeTank extends StarUnit{
	
	public SiegeTank() {
		super("시즈탱크", 30, 100, 7, 2.0, 200, 50);
	}
	
	public void siegeMode() {
		System.out.println("피슈웅~우웅!");
		super.setDamage(70);
		super.setAttackRange(12);
	}	

	@Override
	public String toString() {
		return "SiegeTank [name=" + getName() + ", damage=" + getDamage()
				+ ", hp=" + getHp() + ", attackRange=" + getAttackRange() + ", attackSpeed="
				+ getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
	}
	
}
