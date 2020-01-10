package programingClass;

import java.util.Scanner;

public class PassWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password");
		String pwd = sc.nextLine();
		int upperCase = 0;
		int		digit=0;
			int	specialchar=0;
		if(pwd.length()<8)
		{
			System.out.println("invalid Password");
			System.exit(0);
		}
		for(int i=0;i<pwd.length();i++)
		{
			if((pwd.charAt(i)>='A'&&pwd.charAt(i)<='Z')||(pwd.charAt(i)>='a'&&pwd.charAt(i)<='z'))
			{
				if(pwd.charAt(i)>='A'&&pwd.charAt(i)<='Z')
				{
					
					upperCase++;
				}
			}
			else if(pwd.charAt(i)>='0'&&pwd.charAt(i)<='9')
			{
				digit++;
			}
			else if(pwd.charAt(i)==' ')
			{
				System.exit(0);
			}
			else
			{
				specialchar++;
			}
		
		}
		if(upperCase>0&&digit>0&&specialchar>0)
		{
			System.out.println("entered password is valid");
		}
		else 
		{
			System.out.println("entered password is invalid try again");
		}
		
	}

}
