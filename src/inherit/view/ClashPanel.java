package inherit.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import inherit.controller.InheritController;

import java.awt.Color;

import javax.swing.*;


public class ClashPanel extends JPanel
{
	private InheritController baseController;
	private SpringLayout baseLayout;
	private JButton jacobsButton;
	private JButton issacsButton;
	private JButton tylersButton;
	private JButton aricksButton;
	
	public ClashPanel(InheritController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		jacobsButton = new JButton("Jacob's button");
		issacsButton = new JButton("Issac's button");
		tylersButton = new JButton("Tyler's button");
		aricksButton = new JButton("Arick's button");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(jacobsButton);
		this.add(issacsButton);
		this.add(tylersButton);
		this.add(aricksButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, jacobsButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, jacobsButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, issacsButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, issacsButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, tylersButton, 0, SpringLayout.NORTH, jacobsButton);
		baseLayout.putConstraint(SpringLayout.EAST, tylersButton, 0, SpringLayout.EAST, issacsButton);
		baseLayout.putConstraint(SpringLayout.NORTH, aricksButton, 0, SpringLayout.NORTH, issacsButton);
		baseLayout.putConstraint(SpringLayout.WEST, aricksButton, 0, SpringLayout.WEST, jacobsButton);
	}
	
	private void setupListeners()
	{
		
		
	}
}
