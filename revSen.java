//Program2: Reverse word in String

import java.util.*;
class revSen
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String sen = sc.nextLine();
		String[] wordarr = sen.split("\\s+");
		System.out.print("Output: ");
		for(int i = wordarr.length-1; i>=0 ; i--)
		{
			System.out.print(wordarr[i] + " ");
		}
		System.out.println();
	}
}
	
