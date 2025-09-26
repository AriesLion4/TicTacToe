import java.util.Scanner;
public class TicTacToe
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner (System.in);
		static String xo;
		public static void main(String[] args)
			{
			welcomeMessage();

			}

		private static void welcomeMessage()
			{
				System.out.println("Welcome to Tic Tac Toe!");
				System.out.println("What would You like to be X or O?");
				System.out.println("hello Mr.Mcguire, I am at home currently doing nothing with this project because I dont wnat to do this until until tomorrow");
				xo = userStringInput.nextLine();
				
				
				
			}

	}
