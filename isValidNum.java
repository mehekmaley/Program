//Program3: Valid Number

import java.util.Scanner;
class isValidNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		int s=0;
		int d=0;
		int e=0;
		System.out.print("Input: ");
		String str = sc.nextLine();
		int n = str.length();
		for(int i=0; i < n; i++)
		{
			if(str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' || 
			str.charAt(i)=='8' || str.charAt(i)=='9' || str.charAt(i)=='e' || (str.charAt(i)=='+' && s==0) || (str.charAt(i)=='-' && s==0) || (str.charAt(i)=='.' && d==0 && e==0) || str.charAt(i)==' ')
			{ 
				if(str.charAt(i)=='+' || str.charAt(i)=='-')
				{
					s=1;
				}
				if(str.charAt(i)=='.')
				{
					d=1;
				}
				if(str.charAt(i)=='e')
				{
					e=1;
				}
				flag = true;
			}
			else
			{
				flag = false;
				System.out.println(str+" => "+flag);
				break;
			}
		}
		if(flag == true)
		{
			System.out.println(str+" => "+flag);
		}
	}
}
				 
