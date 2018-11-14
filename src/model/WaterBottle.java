package model;

public class WaterBottle
{
	//Variables
	private boolean hasStraw;
	private int canHold;
	private String color;
	
	public WaterBottle()
	{
		hasStraw = false;
		canHold = -99;
		color = "beep";
	}
	
	public void setHasStraw(boolean hasStraw)
	{
		this.hasStraw = hasStraw;
	}
	public void setCanHold(int canHold)
	{
		this.canHold = canHold;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	
	public boolean getHasStraw()
	{
		return hasStraw;
	}
	public int getCanHold()
	{
		return canHold;
	}
	public String getColor()
	{
		return color;
	}
	
	
	
	
	
}
