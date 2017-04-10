package inherit.model;

public class GoblinBarrel extends ClashCharacters implements SpecialMove
{
	public GoblinBarrel()
	{
		super("GoblinBarrel", 45);
	}
	public int hitDamage()
	{
		return 8;
	}
	public String someName(String name)
	{
		if(name.contains("o") || name.contains("O"))
		{
			name.replace("o", "derp");
			name.replace("O", "DERP");
		}
		else
		{
			name += "Clash" + name + "Royale";
		}
		return name;
	}
	
	public boolean wreckable()
	{
		return true;
	}
	
	public int defence()
	{
		return 300;
	}
	
}
