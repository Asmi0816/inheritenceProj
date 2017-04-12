package inherit.controller;


import java.util.ArrayList;
import inherit.model.*;
import inherit.view.ClashFrame;



public class InheritController 
{
	private ClashFrame baseFrame;
	
	private ArrayList<ClashCharacters> clash;
	
	public void start()
	{
		baseFrame = new ClashFrame(this);
		clash = new ArrayList<ClashCharacters>();
	}
	
	public String arickClicked()
	{
		String aricksCharacter = "";
		int random = (int)(Math.random()*3);
		clash.removeAll(clash);
		
		if(new GoblinBarrel() instanceof ClashCharacters && random == 0)
		{
			clash.add(new GoblinBarrel());
			aricksCharacter = clash.toString();
		}
		if(new Barbarians() instanceof ClashCharacters && random == 1)
		{
			clash.add(new Barbarians());
			aricksCharacter = clash.toString();
		}
		if(new MiniDragon() instanceof ClashCharacters && random == 2)
		{
			clash.add(new MiniDragon());
			aricksCharacter = clash.toString();
		}
		
		return aricksCharacter;
	}
	
	public String issacClicked()
	{
		String issacsCharacter = "";
		clash.removeAll(clash);
		if(new Car() instanceof ClashCharacters)
		{
			clash.add(new Car());
			issacsCharacter = clash.toString();
		}
		return issacsCharacter;
	}
	
	public String jacobClicked()
	{
		String jacobCharacter = "";
		clash.removeAll(clash);
		if(new MemeMonster() instanceof ClashCharacters)
		{
			clash.add(new MemeMonster());
			jacobCharacter = clash.toString();
		}
		return jacobCharacter;
	}
	
	public String tylerClicked()
	{
		String tylerCharacter = "";
		clash.removeAll(clash);
		if(new Giants() instanceof ClashCharacters)
		{
			clash.add(new Giants());
			tylerCharacter = clash.toString();
		}
		return tylerCharacter;
	}
}
