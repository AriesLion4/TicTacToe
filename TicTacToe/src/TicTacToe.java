import java.util.Scanner;
public class TicTacToe
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner (System.in);
		static String xo;
		public static void main(String[] args)
			{
			welcomeMessage();
			
			Board.prepareBoard();
			Board.displayBoard();
			int counter = 0;
			while(counter < 9)
				{
		PlayerMove.askPlayer();
		PlayerMove.playerInput();
		Board.displayBoard();
		OpponentInput.askopponent();
		Board.displayBoard();
				}
           
				
			}
		
           
           
			

		public static void welcomeMessage()
			{
				
				System.out.println("Welcome to Tic Tac Toe!");
				
				
				
				
			}

	}
