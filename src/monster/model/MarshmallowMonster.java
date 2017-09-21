package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	public MarshmallowMonster() 	
	{
		//initializes everything to 0, false or null
	}
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleCount, boolean hasBloop) 
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void setTentacleAmount(int tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	public void setHasBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;	
	}
	// ^ Assigning all of them to integers and values for the responses to work.
	public String toString()
	{
	String description = "I am a stinky monster, my name is " + name + " I have" + eyeCount +  " eyes and only";
	description += tentacleAmount + " tentacles but I have" + armCount + " arms!." + hasBloop + "tells you";
	description += " if I have a bloop"; 
	return description;
	}	
	// Using the methods to make sure that we get the right amount and to make sure everything works.
}