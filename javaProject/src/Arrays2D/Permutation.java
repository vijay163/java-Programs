package Arrays2D;

import java.security.Permission;
import java.util.Scanner;

public class Permutation
{
	public static void main(String[] args) 
    {  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
        String str =  sc.nextLine();
        int n = str.length(); 
        Permutation per = new Permutation();
        per.permute(str, 0, n - 1); 
        System.out.println("*Total number of Permutations and combinations is**");
        int total = factorial(n);
        System.out.println(total);
    } 
 
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++)
            { 
                str = swap(str, l, i); 
                permute(str, l + 1, r); 
                str = swap(str, l, i); 
            } 
        } 
    } 
  
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] c = a.toCharArray(); 
        temp = c[i]; 
        c[i] = c[j]; 
        c[j] = temp; 
        return String.valueOf(c); 
    } 
    public static int factorial(int n)
	{
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		return result;
	}
	
} 
