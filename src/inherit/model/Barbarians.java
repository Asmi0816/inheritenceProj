package inherit.model;

public class Barbarians extends ClashCharacters implements SpecialMove
{
	public Barbarians()
	{
		super("Barbarians", 34);
	}
	public int hitDamage()
	{
		return 800;
	}
	public String someName(String name)
	{
		if(name.contains("a") || name.contains("A"))
		{
			name.replace("a", "derp");
			name.replace("A", "DERP");
		}
		else
		{
			name += "Clash" + name + "Royale";
		}
		return name;
	}
	public boolean wreckable()
	{
		return false;
	}
	
	public int defence()
	{
		return 1000;
	}
	
	@Override
	public String toString() {
		return "Barbarian hit damage is " + hitDamage() + "\n" + "And has a battle name of " + someName(super.getName()) +"\n" + " Barbarians are " + wreckable() +
				" wreckable \n" + "And it's defence level is " + defence() + "\n"+ super.toString();
	}
}
