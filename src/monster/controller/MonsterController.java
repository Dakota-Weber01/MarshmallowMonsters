package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{

	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster yeet = new MarshmallowMonster("Stinky Yeet Monster", 2, 6, 1, true);
		System.out.println(yeet);
		System.out.println("I am feeling hungry, I'm going to eat one of Yeet's arms");
		yeet.setArmCount(yeet.getArmCount()-1);
		{
		interactWithMonster(yeet); }
		}
	
		
			private void interactWithMonster(MarshmallowMonster currentMonster)
			{
		{
			Scanner myScanner = new Scanner(System.in);
			System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type how many");
			int Consumed = myScanner.nextInt();
			currentMonster.setEyeCount(currentMonster.getEyeCount() - Consumed);
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
		
			myScanner.close();
			}
			
	}
	
}
 