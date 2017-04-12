package inherit.model;

public class Giants extends ClashCharacters implements SpecialMove
{
	public Giants()
	{
		super("Giants", 34);
	}
	public int hitDamage()
	{
		return 12600;
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
		return 12000;
	}
	
	@Override
	public String toString() {
		return "Giants hit damage is " + hitDamage() + "\n" + "And has a battle name of " + someName(super.getName()) +"\n" + " Giants is " + wreckable() +
				" wreckable \n" + "And it's defence level is " + defence()+ "\n" + super.toString();
	}
}


