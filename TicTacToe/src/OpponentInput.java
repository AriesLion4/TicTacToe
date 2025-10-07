import java.util.Scanner;
public class OpponentInput
	{
		static Scanner userStringInput = new Scanner(System.in);
		static String opponentmove;
		
		
			


			public static void askopponent()
				{
						{
							System.out.println("Opponent, What is your move?");
							opponentmove = userStringInput.nextLine();
							opponentmove=opponentmove.toUpperCase();
							if (opponentmove.equals("A1"))
								{
									Board.myBoard[0][0]= "O";
								}
							else if (opponentmove.equals("A2"))
								{
									Board.myBoard[0][1]= "O";
								}
							else if (opponentmove.equals("A3"))
								{
									Board.myBoard[0][2]= "O";
								}
							else if (opponentmove.equals("B1"))
								{
									Board.myBoard[1][0]= "O";
								}
							else if (opponentmove.equals("b2"))
								{
									Board.myBoard[1][1]= "O";
								}
							else if (opponentmove.equals("B3"))
								{
									Board.myBoard[1][2]= "O";
								}
							else if (opponentmove.equals("C1"))
								{
									Board.myBoard[2][0]= "O";
								}
							else if (opponentmove.equals("C2"))
								{
									Board.myBoard[2][1]= "O";
								}
							else if (opponentmove.equals("C3"))
								{
									Board.myBoard[2][2]= "O";
								}
							else
								{
									
								}
						}
					
				}


			
	}
