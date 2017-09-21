package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	// Calling the the popup window from what I imported to make the window appear
public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	public String getResponse(String questionToDisplay)
	{
		String answer = "";
		answer += JOptionPane.showInputDialog(null, questionToDisplay);
		return answer;
	}
	
}
