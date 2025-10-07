import java.util.Scanner;
public class PlayerMove
	{
		static String move;
		static Scanner userStringInput = new Scanner(System.in);
		
		
			


			 public static void askPlayer()
				{
					System.out.println("What square would you like to move to!");
					move = userStringInput.nextLine();
					
					
				}


			public static void playerInput()
				{
					move=move.toUpperCase();
					if (move.equals("A1"))
						{
							Board.myBoard[0][0]= "X";
						}
					else if (move.equals("A2"))
						{
							Board.myBoard[0][1]= "X";
						}
					else if (move.equals("A3"))
						{
							Board.myBoard[0][2]= "X";
						}
					else if (move.equals("B1"))
						{
							Board.myBoard[1][0]= "X";
						}
					else if (move.equals("b2"))
						{
							Board.myBoard[1][1]= "X";
						}
					else if (move.equals("B3"))
						{
							Board.myBoard[1][2]= "X";
						}
					else if (move.equals("C1"))
						{
							Board.myBoard[2][0]= "X";
						}
					else if (move.equals("C2"))
						{
							Board.myBoard[2][1]= "X";
						}
					else if (move.equals("C3"))
						{
							Board.myBoard[2][2]= "X";
						}
					else
						{
							
						}
				}
	}
	