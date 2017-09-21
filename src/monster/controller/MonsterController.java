package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;
public class MonsterController
{
	private MonsterDisplay popup;
	
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
//		System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster yeet = new MarshmallowMonster("Stinky Yeet Monster", 2, 6, 1, true);
//		System.out.println(yeet);
		popup.displayText(yeet.toString());
//		System.out.println("I am feeling hungry, I'm going to eat one of Yeet's arms");
		popup.displayText(yeet.toString());
		yeet.setArmCount(yeet.getArmCount()-1);
		{
		interactWithMonster(yeet); }
		}
			private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		{
			Scanner myScanner = new Scanner(System.in);
//			System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type how many");
			int consumed;
			String response = int consumed = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type how many");
			if (isValidInteger(response))
			consumed = Integer.parseInt(response);
//			int Consumed = myScanner.nextInt();
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			System.out.println(currentMonster);
			System.out.println("How many arms are you interested in eating?, I have " + currentMonster.getArmCount()); 
			//consumed = myScanner.nextInt();
			int armEat = myScanner.nextInt();
			
			if(armEat == 0)
			{
				System.out.println("Not hungry? oh so sad...");
			}
			else if(armEat < 0)
			{
				System.out.println("Reality is hard for you - it is impossible to eat a negative amount");
			}		
			else if(armEat - currentMonster.getArmCount() < 0)		
			{
			System.out.println("You are not allowed to eat more than exist on me :/");
			}		
			else
			{
				System.out.println("OK, now I have this many arms " + currentMonster.getArmCount());
			}
			System.out.println("how many tentacles do you want to eat? I have" + currentMonster.getTentacleAmount());
			double food = myScanner.nextDouble();
			if(food == currentMonster.getTentacleAmount())
			{
				System.out.println("You ate all my tentacles!");
			}
			else
			{
				System.out.println("More likely");
			}
			popup.displayText("Hi there, ready to play?");
			String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
			System.out.println(answer);
			//helper methods
			private boolean isValidInteger(String sample)
			{
				boolean vaild = false;
				try
			}
			{
				Integer.parseInt(sample);
				valid = true;
			}
			{
				catch(NumberFormatException error)
			}
			{
				popup.displayText("You need to input an int, " + sample + "is not valid.");
			}
			myScanner.close();		
		
		
		}		
	}	
}
 