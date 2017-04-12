package inherit.model;

public class MemeMonster extends ClashCharacters implements SpecialMove {

	
	public MemeMonster()
	{
		super("MemeMonster", 76);
		
	}
	
	
	@Override
	public int hitDamage() {
		return (int) Math.random() * 20;
	}

	@Override
	public int defence() {
		return 20;
	}

	@Override
	public String someName(String name) {
		String returnName = "";
		int times =  (int) Math.random() * 15;
		for(int i = 0; i  < times; i++){
			returnName = name.substring(0, i) + " " + ((char)(Math.random() * 26 + 97)) + " " + name.substring(i + 1);
		}
		return returnName;
	}

	@Override
	public boolean wreckable() {
		return true;
	}
	
	@Override
	public String toString() {
		return "MemeMonster hit damage is " + hitDamage() + "\n" + "And has a battle name of " + someName(super.getName()) +"\n" + " MemeMonster is " + wreckable() +
				" wreckable \n" + "And it's defence level is " + defence() + "\n"+ super.toString();
	}

}


