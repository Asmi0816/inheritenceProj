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
}
