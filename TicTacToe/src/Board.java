import java.util.Scanner;

public class Board
	{
		static Scanner userStringInput = new Scanner(System.in);
		static String [] [] myBoard = new String [3] [3];
		public static void displayBoard()
		{
        System.out.println("    1    2    3");
		System.out.println("  -------------");
		System.out.println("A | " + myBoard[0][0] + " | " + myBoard[0][1] + " | " + myBoard[0][2]+" | ");
		System.out.println("  -------------");
	    System.out.println("B | " + myBoard[1][0] + " | " + myBoard [1][1]+ " | " + myBoard [1][2]+" | "); 		
		System.out.println("  -------------");
		System.out.println("C | " + myBoard[2][0] + " | " + myBoard [2][1]+ " | " + myBoard [2][2]+" | ");           
		System.out.println("  -------------");
		}  
		
		
			
			public static void prepareBoard()
				{
					for (int row = 0; row < myBoard.length; row ++)
						{
							for(int col = 0; col <myBoard[0].length;col++)
								{
									myBoard[row][col] = " ";
								}
						}
					
				}
	
	
	
	}


         
    
	
