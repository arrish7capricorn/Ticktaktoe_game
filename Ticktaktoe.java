import java.util.Scanner;


public class Tictaktoe 
{
  
	public static void grid(String[][] table)
	{
		//nested loop time the above is 2d array list
		for(int x=0;x<3;x++)//3*3 array
			
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(" ");
				System.out.print(table[x][y]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println("-----+-----+----- ");
		}
	}
	
	public static String player(String[][] table)//player table
	{
		System.out.println("enter a valid empty place for your move");
		Scanner sc=new Scanner(System.in);
		String place=sc.next();
	
		switch(place)
		{
		case "a":
			if(table[0][0].equals(" "))
			{
				return table[0][0]= "x";
			}
			else
			{
				return player(table);
			}
		case "b":
			if(table[0][1].equals(" "))
			{
				return table[0][1]= "x";
			}
			else
			{
				return player(table);
			}

		case "c":
						if(table[0][2].equals(" "))
			{
				return table[0][2]= "x";
			}
			else
			{
				return player(table);
			}

		case "d":
						if(table[1][0].equals(" "))
			{
				return table[1][0]= "x";
			}
			else
			{
				return player(table);
			}

		case "e":
						if(table[1][1].equals(" "))
			{
				return table[1][1]= "x";
			}
			else
			{
				return player(table);
			}

		case "f":
						if(table[1][2].equals(" "))
			{
				return table[1][2]= "x";
			}
			else
			{
				return player(table);
			}

		case "g":
						if(table[2][0].equals(" "))
			{
				return table[2][0]= "x";
			}
			else
			{
				return player(table);
			}

		case "h":
						if(table[2][1].equals(" "))
			{
				return table[2][1]= "x";
			}
			else
			{
				return player(table);
			}

		case "i":
						if(table[2][2].equals(" "))
			{
				return table[2][2]= "x";
			}
			else
			{
				return player(table);
			}

	    default:
	    	return player(table);
		}
	}
	public static String computer(String[][] table)//computer reply table
	{
		int x=(int)(9*Math.random()+1);
		switch(x)
		{
			case 1:
				if (table[0][0].equals(" "))
				{
					return table[0][0]="o";
				}
				else
				{
					computer(table);
				}
				break;
				
			case 2:
				if (table[0][1].equals(" "))
				{
					return table[0][1]="o";
				}
				else
				{
					computer(table);
				}
				break;
			case 3:
				if (table[0][2].equals(" "))
				{
					return table[0][2]="o";
				}
				else
				{
					computer(table);
				}
				break;
			case 4:
				if (table[1][0].equals(" "))
				{
					return table[1][0]="o";
				}
				else
				{
					computer(table);
				}
				break;
			case 5:
				if (table[1][1].equals(" "))
				{
					return table[1][1]="o";
				}
				else
				{
					computer(table);
				}
				break;
			case 6:
				if (table[1][2].equals(" "))
				{
					return table[1][2]="o";
				}
				else
				{
					computer(table);
				}
				break;
		    case 7:
		    	if (table[2][0].equals(" "))
				{
					return table[2][0]="o";
				}
				else
				{
					computer(table);
				}
				break;
			
			case 8:
				if (table[2][1].equals(" "))
				{
					return table[2][1]="o";
				}
				else
				{
					computer(table);
				}
				break;
			case 9:
				if (table[2][2].equals(" "))
				{
					return table[2][2]="o";
				}
				else
				{
					computer(table);
				}
				break;
		}
		return null;					
	}
	
	public static void game(String [][] table)
	{
		boolean result=false;
		for(int j=0;j<4;j++)
		{
			player(table);
			grid(table);
			if(table[0][0].equals("x") && table[0][1].equals("x") && table[0][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[1][0].equals("x") && table[1][1].equals("x") && table[1][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[2][0].equals("x") && table[2][1].equals("x") && table[2][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[0][0].equals("x") && table[1][1].equals("x") && table[2][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[0][0].equals("x") && table[1][0].equals("x") && table[2][0].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[0][1].equals("x") && table[1][1].equals("x") && table[2][1].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[0][2].equals("x") && table[1][2].equals("x") && table[2][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			if(table[0][2].equals("x") && table[1][1].equals("x") && table[2][1].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			break;
			}
			System.out.println("Computers turn");
			computer(table);
			grid(table);
			if(table[0][0].equals("o") && table[0][1].equals("o") && table[0][2].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[1][0].equals("o") && table[1][1].equals("o") && table[1][2].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[2][0].equals("o") && table[2][1].equals("o") && table[2][2].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[0][0].equals("o") && table[1][1].equals("o") && table[2][2].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[0][0].equals("o") && table[1][0].equals("o") && table[2][0].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[0][1].equals("o") && table[1][1].equals("o") && table[2][1].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[0][2].equals("o") && table[1][2].equals("o") && table[2][2].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
			if(table[0][2].equals("o") && table[1][1].equals("o") && table[2][1].equals("o"))
			{
				System.out.println("YOU LOSE!");
			result = true;
			break;
			}
		}
		if(result==false)
		{
			if(table[0][0].equals("x") && table[0][1].equals("x") && table[0][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
		
			}
			if(table[1][0].equals("x") && table[1][1].equals("x") && table[1][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}
			if(table[2][0].equals("x") && table[2][1].equals("x") && table[2][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}
			if(table[0][0].equals("x") && table[1][1].equals("x") && table[2][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}
			if(table[0][0].equals("x") && table[1][0].equals("x") && table[2][0].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}
			if(table[0][1].equals("x") && table[1][1].equals("x") && table[2][1].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}
			if(table[0][2].equals("x") && table[1][2].equals("x") && table[2][2].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}
			if(table[0][2].equals("x") && table[1][1].equals("x") && table[2][1].equals("x"))
			{
				System.out.println("YOU WIN!");
			result = true;
			
			}

		}
		if(result==false)
		{
			System.out.println("Its a tie!");
		}
		
	}
				
	public static void main (String[] args) 
	{
		// TODO Auto-generated method stub
       //System.out.println("hello world!");
		String[][] table=new String[3][3];
        for(int x=0;x<3;x++)//3*3 array
			
		{
			for(int y=0;y<3;y++)
			{
				table[x][y]=" ";
			}
		}
			grid(table);
			game(table);
			
	  }

}
