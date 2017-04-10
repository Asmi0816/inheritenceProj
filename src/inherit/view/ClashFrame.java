package inherit.view;

import java.awt.Dimension;
import javax.swing.JFrame;


import inherit.controller.InheritController;

public class ClashFrame extends JFrame
{
	private InheritController baseController;
	private ClashPanel basePanel;
	
	public ClashFrame(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new ClashPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Grid Title Of Funnnnn!!!!");
		this.setSize(new Dimension(1080, 600));
		this.setResizable(false);
		this.setVisible(true);
	}
	public InheritController getBaseController()
	{
		return baseController;
	}
	public void setBaseController(InheritController baseController)
	{
		this.baseController = baseController;
	}

}
