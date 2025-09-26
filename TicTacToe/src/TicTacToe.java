import java.util.Scanner;
public class TicTacToe
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner (System.in);
		static String xo;
		public static void main(String[] args)
			{
			//welcomeMessage();
              Board.displayBoard();
              Board.prepareBoard();
			}

		public static void welcomeMessage()
			{
				
				System.out.println("Welcome to Tic Tac Toe!");
				System.out.println("What would You like to be X or O?");
				xo = userStringInput.nextLine();
				
				
				
			}

	}
