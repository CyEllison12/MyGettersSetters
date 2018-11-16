package controller;
import model.WaterBottle;
import javax.swing.JOptionPane;

public class Controller
{
	private WaterBottle userBottle;
	private WaterBottle myBottle;
	
	public Controller()
	{	
		
		userBottle = new WaterBottle();
		myBottle = new WaterBottle(true, 750, "Blue");
		WaterBottle[] arrayBottle = new WaterBottle[5];
	}
	
	public void start()
	{
		questions();
		
		
		
	}
	
	public void questions()
	{
		String userInput = JOptionPane.showInputDialog(null, "What color is your Water Bottle?");
		userBottle.setColor(userInput);
		
		userInput = JOptionPane.showInputDialog(null, "How much water can your bottle hold in ml?");
		while(!validInt(userInput))
		{
		userInput = JOptionPane.showInputDialog(null, "How much water can your bottle hold in ml? (Type a whole number)");
		}
		userBottle.setCanHold(Integer.parseInt(userInput));
		
		userInput = JOptionPane.showInputDialog(null, "Does your watter bottle have a straw?");
		if(userInput.contains("true") || userInput.contains("True"))
		{
			userBottle.setHasStraw(true);
		}
		else
		{
			userBottle.setHasStraw(false);
		}
		
		JOptionPane.showMessageDialog(null, "This is the water bottle you created: "
										+ "\nColor: " + userBottle.getColor() 
										+ "\nHow much liquid it can hold: " + userBottle.getCanHold() + " ml"
										+ "\nDoes the bottle have a straw: " + userBottle.getHasStraw());
	}
	
	public boolean validInt(String maybeInt)
	{
		
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}
}
