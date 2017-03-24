package inherit.controller;


import java.util.ArrayList;
import inherit.model.*;


public class InheritController 
{
	private ArrayList<ClashCharacters> clash;
	
	public void start()
	{
		clash = new ArrayList<ClashCharacters>();
		if(new GoblinBarrel() instanceof ClashCharacters)
		{
			clash.add(new GoblinBarrel());
		}
		if(new Barbarians() instanceof ClashCharacters)
		{
			clash.add(new Barbarians());
		}
		if(new MiniDragon() instanceof ClashCharacters)
		{
			clash.add(new MiniDragon());
		}
		System.out.println(clash);
	}
}
