package inherit.model;

public class MiniDragon extends ClashCharacters implements SpecialMove
{
	public MiniDragon()
	{
		super("MiniDragon", 100);
	}
	
	public int hitDamage()
	{
		return 80;
	}
}
