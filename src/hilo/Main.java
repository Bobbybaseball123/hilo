package hilo;
//Copyright Bobby Duoto 2013
import java.util.Random;
import javax.swing.JOptionPane;

public class Main
{
	private static String guess;
	private static int guessInt;
	private static Random r = new Random();
	private static int secretNumber;
	private static int playCount = 0;

	public static void main(String[] args)
	{
		secretNumber = r.nextInt(100);
		while (true)
		{
			playCount = playCount + 1;
			guess = JOptionPane
					.showInputDialog("guess a number bwteen 1 and 100");
			guessInt = Integer.parseInt(guess);
			if (guessInt > secretNumber) // too high
			{
				JOptionPane.showMessageDialog(null, "you're too high dummy");
			}
			if (guessInt < secretNumber) // too low
			{
				JOptionPane.showMessageDialog(null, "you're too low dummy");
			}
			if (guessInt == secretNumber)// right answer
			{
				JOptionPane.showMessageDialog(null,
						"you're not dumb, it took you " + playCount + " tries");
				System.exit(0);
			}
		}
	}
}
