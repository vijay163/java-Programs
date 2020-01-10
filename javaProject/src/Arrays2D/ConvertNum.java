//WAP to convert numeric values into word foramte
package Arrays2D;

import java.util.Scanner;

public class ConvertNum 
{
	static String[] a= {"","one","two","three","four","five","six","seven","eight","nine"
			,"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
			"seventeen","eighteen","nineteen"};
    static String[] b= {"", "","twenty","thirty","fourty","fifty","sixty"
    		,"seventy","ninty"};
    static void printNUmber(int n,String word)
    {
    	if(n>19)
    	{
    		System.out.print(b[n/10]+" "+a[n%10]+" ");
    	}
    	else
    	System.out.print(a[n]+" ");
    	if(n>0)
    		System.out.print(word);
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num<0)
		{
			System.out.print("minus ");
			num=-num;
		}
		if(num>0)
		{
		printNUmber((num/10000000)%100,"core ");
		printNUmber((num/100000)%100,"lakh ");
		printNUmber((num/1000)%100,"thousand ");
		printNUmber((num/100)%10,"Hundred ");
	   printNUmber((num%100), " ");
    
		}
		else
		{
		System.out.println("Entered number should be greater than 0");	
		}
		}
    }
