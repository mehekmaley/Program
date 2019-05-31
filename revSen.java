//Program2: Reverse word in String

import java.util.Scanner;
class revSen3
{
	public static void reverse(String sen)
	{
		String word="";
		int n=sen.length()-1;
		int f=n;
		int k=0;
		while(n>=0)
		{
			if(n>=0 && sen.charAt(n)!=' ')
			{
				word += sen.charAt(n);
				n--;
				f--;
			}	
			else if(sen.charAt(n)==' ' && (n==sen.length()-1))
			{
				while(n>=0 && sen.charAt(n)==' ')
				{
					n--;
				}
			}
			else
			{
				while(n>=0 && sen.charAt(n)==' ')
				{
					n--;
				}
				reverse(word);
				word="";
				if(n!=-1)
				{
					System.out.print(" ");
				}
			}
		}
		if(f!=n)
		{
			reverse(word);
			k=1;
		}
		if(k!=1)
		{
			System.out.print(word);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT: ");
		String sen = sc.nextLine();
		reverse(sen);
	}
}
		
		
