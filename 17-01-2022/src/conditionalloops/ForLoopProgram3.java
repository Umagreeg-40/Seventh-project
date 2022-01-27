package conditionalloops;

import java.util.Scanner;

public class ForLoopProgram3
{

	public static void main(String[] args) 
	{
		int start,end;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the start value: ");
		start = s.nextInt();
		
		System.out.println("Enter the second value: ");
		end = s.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
		
		s.close();
	}

}
