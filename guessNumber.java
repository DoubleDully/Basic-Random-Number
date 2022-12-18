/*
    Name:           Christopher W. Hudson
    Date:           12/04/2022
    Description:    This program is a random number guessing game. A random
                    number is generated and the end users goal is to guess 
                    the number correctly. 
 */
import javax.swing.JOptionPane;

public class guessNumber 
{
  public static void main(String[] args) 
  {
    // Create Base Variables For Start of Random Number
    int calcNum = (int) (Math.random() * 100 + 1);
    int userResponse = 0;
    int count = 1;
    
    // Create Output For Correct Number
    System.out.println("The Correct Number Was: " + calcNum);

    // Statment For Invalid Start
    while (userResponse != calcNum) 
    {
      String response = JOptionPane.showInputDialog( null,
      "Guess a Number Between 1 and 100", "Guess the Number Game"
     ,3);

      userResponse = Integer.parseInt(response);

      // Display Dialog Box to User
      JOptionPane.showMessageDialog( null, "" 
      + determineGuess(userResponse, calcNum, count));
      count++;
    }
  }

  /**
   * @param userResponse Number guessed by the user
   * @param calcNum Calculated random (correct) number
   * @param count Add number of guesses as needed
   * @return Too High, Too Low, or Correct as an answer
   */
  public static String determineGuess(int userResponse, int calcNum, int count)
  
  // Create else-if Statement to Determine Invalid, Correct, Lower, or Higher
  {
    if (userResponse <= 0 || userResponse > 100) 
    {
      return "Your Guess is Invalid!";
    }
    else if (userResponse == calcNum)   // Equal To
      return "Your Guess Was Correct!\nTotal Guesses: " + count;
    else if (userResponse > calcNum)    // Greater Than
      return "Your Guess is Too High, Please Try Again.\nTimes Attempted: " 
                                                                + count;
    else if (userResponse < calcNum)    // Less Than
      return "Your Guess Was Too Low, Please Try Again.\nTimes Attempted: " 
                                                                + count;
    else                                // Anything Else
      return "Your Guess Was Incorrect\nTimes Attempted: " + count;
  }     
}