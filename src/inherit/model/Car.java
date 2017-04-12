package inherit.model;

public class Car extends ClashCharacters implements SpecialMove 
{
	public Car()
	{
		super("Lambrogini", 34);
	}

	@Override
	public int hitDamage() 
	{
		int damage = (int) (Math.random()*20)+ 1;
		return damage;
	}

	@Override
	public String someName(String name) 
	{
		if(!name.toLowerCase().equals("lamborghini")){
			name += " car";
		}
		return name;
	}

	@Override
	public boolean wreckable() 
	{
		return true;
	}
	
	@Override
	public int defence() 
	{
		int defence = (int) (Math.random()*10)+1;
		return defence;
	}
	
	@Override
	public String toString() {
		return "lamborghini hit damage is " + hitDamage() + "\n" + "And has a battle name of " + someName(super.getName()) +"\n" + " lamborghini is " + wreckable() +
				" wreckable \n" + "And it's defence level is " + defence() + "\n"+ super.toString();
	}

}
