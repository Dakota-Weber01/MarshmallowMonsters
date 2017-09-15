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
			
	myScanner.close();
		}
	}
	
}
 