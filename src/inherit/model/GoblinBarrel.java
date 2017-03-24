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
}
