package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;
import java.util.List;
import java.util.ArrayList;
public class MonsterController
{
	private MonsterDisplay popup;
	private List<MarshmallowMonster> monsterList;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
		monsterList = new ArrayList<MarshmallowMonster>();
	}
	

	public void start()
	
	{
//	{
//		int count = 0; 
//		while(count < 10)
//		{
//			popup.displayText("Am I not the coolest?!");
//			count +=2;
//		}
	
//		for(int loop = 0; loop < 10; loop += 1)
//		{
//			popup.displayText("This is loop # " + (loop + 1) + "of ten");
//		}
	}
		MarshmallowMonster basic = new MarshmallowMonster();
		//		System.out.println(basic);
		{
			popup.displayText(basic.toString());
		
		MarshmallowMonster yeet = new MarshmallowMonster("Stinky Yeet Monster", 2, 6, 1, true);
//		System.out.println(yeet);
		popup.displayText(yeet.toString());
//		System.out.println("I am feeling hungry, I'm going to eat one of Yeet's arms");
		popup.displayText("I am feeling hungry, I'm going to eat one of Yeet's arms");
		popup.displayText(yeet.toString());
		yeet.setArmCount(yeet.getArmCount()-1);
		
		monsterList.add(basic);
		monsterList.add(yeet);
		useList();
		
		interactWithMonster(yeet); 
		
		}
			private void useList()
			{
				for (int index = 0; index < monsterList.size(); index++)
				{
					MarshmallowMonster currentMonster = monsterList.get(index);
					popup.displayText(currentMonster.getName());
					String updateName = popup.getResponse("What Should my new name be?");
					currentMonster.setname(updateName);
					popup.displayText("My new name is " + currentMonster.getName());
				}
				
			for (MarshmallowMonster current : monsterList)
			{
				popup.displayText("My name is" + current.getName());;
			}
			
			}
			
			private void interactWithMonster(MarshmallowMonster currentMonster)
			// Classes and imported objects scanners, displays etc.
			{
		{
			{
//			Scanner myScanner = new Scanner(System.in);
//			System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type how many");
			popup.displayText(currentMonster.getName() + "wants to know how many eyes you want to eat, please type how many");
			int consumed;
			Response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type how many");
			while(isValidInteger(Response))
			consumed = Integer.parseInt(Response);
//			int Consumed = myScanner.nextInt();
			int Consumed = popup.nextInt();
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
//			System.out.println(currentMonster);
			popup.displayText("How many arms are you interested in eating? I have " + currentMonster.getArmCount()); 
//			System.out.println("How many arms are you interested in eating?, I have " + currentMonster.getArmCount()); 
//			consumed = myScanner.nextInt();
//			int armEat = myScanner.nextInt();
			while(!isValidInteger(Response))
			
				Response = popup.getResponse("NO type in an integer value aka 0-2billion");
			
				
			}
			int armEat = popup.nextInt();
			if(armEat == 0)
			{
				System.out.println("Not hungry? oh so sad...");
			}
			else if(armEat < 0)
			{
				System.out.println("Reality is hard for you - it is impossible to eat a negative amount");  // All of the old println's changed to popup windows so that it runs through java.
			}		
			while(armEat - currentMonster.getArmCount() < 0)		
			{
			System.out.println("You are not allowed to eat more than exist on me :/");
			}		
			
			{
				System.out.println("OK, now I have this many arms " + currentMonster.getArmCount());
			}
//			System.out.println("how many tentacles do you want to eat? I have" + currentMonster.getTentacleAmount());
			popup.displayText("how many tentacles do you want to eat? I have" + currentMonster.getTentacleAmount());
			double food = popup.getResponse("" + nextDouble); 
			while(food == currentMonster.getTentacleAmount())
			{
//				System.out.println("You ate all my tentacles!");
				popup.displayText("You ate all my tentacles!");
			}
			
			{
//				System.out.println("More likely");
				popup.displayText("More likely");
			}
			
			{
			popup.displayText("Hi there, ready to play?");
			}
			String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
			popup.displayText(answer);
		}
//			System.out.println(answer);
			//helper methods
				
					
				}
			private boolean isValidInteger(String sample)
			{
			{
				variable valid = false;
			}
			{
				Integer.parseInt(sample);
				{
				valid = true;
				{
				{
				catch(NumberFormatException Error);
				}
				
				popup.displayText("You need to type in a double -" + sampleDouble);
			}
			{
				popup.displayText("You need to input an int, " + sample + "is not valid.");
			}
				}
			
			
} 				
	}		
			
//			myScanner.close();
			
			
			
	}	

 